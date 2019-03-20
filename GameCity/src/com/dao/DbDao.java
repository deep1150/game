package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.beans.Game;
import com.beans.UserBean;
import com.util.DbUtil;

public class DbDao {

	public int setUserData(UserBean u) throws SQLException
	{
		int x=0;
		Connection con=DbUtil.getConnection();
		String str="insert into gameuser values(?,?)";
		PreparedStatement psmt=con.prepareStatement(str);
		psmt.setInt(1,u.getUid());
		psmt.setString(2, u.getUname());
		x=psmt.executeUpdate();
		return x;
	}
	
	
	public ArrayList<Game> listGames() throws SQLException
	{
		ArrayList<Game> al=new ArrayList<Game>();
		Connection con=DbUtil.getConnection();
		String str="select * from game";
		PreparedStatement psmt=con.prepareStatement(str);
		ResultSet rs=psmt.executeQuery();
		while(rs.next())
		{
			int gid=rs.getInt(1);
			String gname=rs.getString(2);
			int gprice=rs.getInt(3);
			Game g=new Game(gid, gname, gprice);
			al.add(g);
		}
		
		return al;
	}
}
