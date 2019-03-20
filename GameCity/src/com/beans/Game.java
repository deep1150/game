package com.beans;

public class Game {

	int gid;
	String gname;
int gprice;
	
	
	public Game() {
	
		
	}
	public Game(int gid, String gname, int gprice) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.gprice = gprice;
	}
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public int getGprice() {
		return gprice;
	}
	public void setGprice(int gprice) {
		this.gprice = gprice;
	}
	
	@Override
	public String toString() {
		return "Game [gid=" + gid + ", gname=" + gname + ", gprice=" + gprice + "]";
	}
	
	
	
	
}
