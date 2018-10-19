package com.testmybatis.model.pojo;

public class Mytalkuser {

	private int id;
	private String tusername;
	private String tpassword;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTusername() {
		return tusername;
	}
	public void setTusername(String tusername) {
		this.tusername = tusername;
	}
	public String getTpassword() {
		return tpassword;
	}
	public void setTpassword(String tpassword) {
		this.tpassword = tpassword;
	}
	@Override
	public String toString() {
		return "Mytalkuser [id=" + id + ", tusername=" + tusername + ", tpassword=" + tpassword + "]";
	}
	public Mytalkuser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mytalkuser(int id, String tusername, String tpassword) {
		super();
		this.id = id;
		this.tusername = tusername;
		this.tpassword = tpassword;
	}
	
	
}
