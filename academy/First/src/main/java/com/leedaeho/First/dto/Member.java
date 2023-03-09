package com.leedaeho.First.dto;

import java.util.Objects;

public class Member { //DTO 클래스
	private String userId;
	private String pwd;
	private String iname;
	private String addr;	
	public Member() {
	}
	
	public Member(String userId, String pwd, String iname, String addr) {
		this.userId = userId;
		this.pwd = pwd;
		this.iname = iname;
		this.addr = addr;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getIname() {
		return iname;
	}
	public void setIname(String iname) {
		this.iname = iname;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	@Override
	public int hashCode() {
		return Objects.hash(addr, iname, pwd, userId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return Objects.equals(addr, other.addr) && Objects.equals(iname, other.iname) && Objects.equals(pwd, other.pwd)
				&& Objects.equals(userId, other.userId);
	}
	@Override
	public String toString() {
		return "Member [userId=" + userId + ", pwd=" + pwd + ", iname=" + iname + ", addr=" + addr + "]";
	}
	
	
}
