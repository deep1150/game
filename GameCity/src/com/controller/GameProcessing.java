package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.beans.Game;
import com.beans.UserBean;
import com.service.DbService;

/**
 * Servlet implementation class GameProcessing
 */
public class GameProcessing extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GameProcessing() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw= response.getWriter();
		
		String target="";
		HttpSession hsn=request.getSession();
		
		DbService ds=new DbService();
		if(hsn.equals("null"))
		{
			pw.println("Session not initiated");
		}
		else
		{
		String act=request.getParameter("action");
		if(act.equals("Submit"))
		{
			int uid=Integer.parseInt(request.getParameter("uid"));
			String uname=request.getParameter("uname");
			int amt=Integer.parseInt(request.getParameter("amt"));
			
		UserBean u=new UserBean(uid, uname);
	
		hsn.setAttribute("username", uname);
		hsn.setAttribute("amount", amt);
		
		try {
			
			int x=ds.setUserData(u);
			if(x>0)
			{
				target="Dashboard.jsp";
			}
			else
			{
				pw.write("Insertion unsuccessful");
			}
			
		}
		
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
		
		else if(act.equals("Continue"))
		{
			try {
				ArrayList<Game> al=ds.listGames();
				hsn.setAttribute("gamelist", al);
				target="GameList.jsp";
			
			} 
			
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		else if(act.equals("Logout"))
		{
			hsn.invalidate();
			target="Welcome.jsp";
		}
		
		else if(act.equals("play"))
		{
			Integer useramt=(Integer) hsn.getAttribute("amount");
			int gamt=Integer.parseInt(request.getParameter("gprice"));
		//	System.out.println("Game Amt "+useramt);
			
		 if(useramt>=gamt)
			{
				useramt=useramt-gamt;
				hsn.setAttribute("amount", useramt);
				target="Dashboard.jsp";
			}
			else
			{
				target="Error.jsp";
//				hsn.setAttribute("amount", 0);
			}
		}	
		else if(act.equals("Click here"))
		{
				target="Dashboard.jsp";
		}
		
		RequestDispatcher rd=request.getRequestDispatcher(target);
		rd.forward(request, response);
		}	
		pw.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
