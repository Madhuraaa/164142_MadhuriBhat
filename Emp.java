package com.collect.sr;

public class Emp {
	
	String empname;
	int empid;
	int no;
	public Emp(String empname,int empid,int no){
		this.empname=empname;
		this.empid=empid;
		this.no=no;
		
	}
	
	
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	@Override
	public String toString() {
		return "Emp [empname=" + empname + ", empid=" + empid + ", no=" + no
				+ "]";
	}
}
