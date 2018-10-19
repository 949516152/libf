package com.model.pojo;

public class User {
	private int Id;
	private String uname,upassword,ucname,utel,uqq,uhome,usex,uage,u01,u02,u03,u04,u05;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpassword() {
		return upassword;
	}
	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}
	public String getUcname() {
		return ucname;
	}
	public void setUcname(String ucname) {
		this.ucname = ucname;
	}
	public String getUtel() {
		return utel;
	}
	public void setUtel(String utel) {
		this.utel = utel;
	}
	public String getUqq() {
		return uqq;
	}
	public void setUqq(String uqq) {
		this.uqq = uqq;
	}
	public String getUhome() {
		return uhome;
	}
	public void setUhome(String uhome) {
		this.uhome = uhome;
	}
	public String getUsex() {
		return usex;
	}
	public void setUsex(String usex) {
		this.usex = usex;
	}
	public String getUage() {
		return uage;
	}
	public void setUage(String uage) {
		this.uage = uage;
	}
	public String getU01() {
		return u01;
	}
	public void setU01(String u01) {
		this.u01 = u01;
	}
	public String getU02() {
		return u02;
	}
	public void setU02(String u02) {
		this.u02 = u02;
	}
	public String getU03() {
		return u03;
	}
	public void setU03(String u03) {
		this.u03 = u03;
	}
	public String getU04() {
		return u04;
	}
	public void setU04(String u04) {
		this.u04 = u04;
	}
	public String getU05() {
		return u05;
	}
	public void setU05(String u05) {
		this.u05 = u05;
	}
	public User(int id, String uname, String upassword, String ucname, String utel, String uqq, String uhome,
			String usex, String uage, String u01, String u02, String u03, String u04, String u05) {
		super();
		Id = id;
		this.uname = uname;
		this.upassword = upassword;
		this.ucname = ucname;
		this.utel = utel;
		this.uqq = uqq;
		this.uhome = uhome;
		this.usex = usex;
		this.uage = uage;
		this.u01 = u01;
		this.u02 = u02;
		this.u03 = u03;
		this.u04 = u04;
		this.u05 = u05;
	}
	
	/**
	 * 一定需要有一个无参的构造方法
	 */
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * 建议重写一个toString方法
	 */
	@Override
	public String toString() {
		return "User [Id=" + Id + ", uname=" + uname + ", upassword=" + upassword + ", ucname=" + ucname + ", utel="
				+ utel + ", uqq=" + uqq + ", uhome=" + uhome + ", usex=" + usex + ", uage=" + uage + ", u01=" + u01
				+ ", u02=" + u02 + ", u03=" + u03 + ", u04=" + u04 + ", u05=" + u05 + "]";
	}
	
	
}
