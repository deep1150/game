package com.beans;

public class UserBean {

	int uid;
	String uname;
	
	public UserBean() {
		super();
		
	}
	public UserBean(int uid, String uname) {
		super();
		this.uid = uid;
		this.uname = uname;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	@Override
	public String toString() {
		return "UserBean [uid=" + uid + ", uname=" + uname + "]";
	}
	
	
	
}
