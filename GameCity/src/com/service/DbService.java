package com.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.beans.Game;
import com.beans.UserBean;
import com.dao.DbDao;

public class DbService {
	
	DbDao dao=new DbDao();
	public int setUserData(UserBean u) throws SQLException
	{
	int x=0;
	 x=dao.setUserData(u);
	 return x;
	}
	
	public ArrayList<Game> listGames() throws SQLException
	{
		ArrayList<Game> al=dao.listGames();
		return al;
	}
}
