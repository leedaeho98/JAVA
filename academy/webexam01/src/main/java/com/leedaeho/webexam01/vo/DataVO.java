package com.leedaeho.webexam01.vo;

public class DataVO {
	// 필드 => VO는 무조건 필드에 private 접근제어자를 넣는다
	private int age;
	private String iname;
	private String address;
	private String gender;
	
	public DataVO() {
		super();
	}

	public DataVO(int age, String iname, String address, String gender) {
		super();
		this.age = age;
		this.iname = iname;
		this.address = address;
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getIname() {
		return iname;
	}

	public void setIname(String iname) {
		this.iname = iname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "DataVO [age=" + age + ", iname=" + iname + ", address=" + address + ", gender=" + gender + "]";
	}
	
	
	
	
	
	
	
}
