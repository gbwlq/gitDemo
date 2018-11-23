package org.lanqiao.entity;

public class Student {
	private int stuNo;
	private String stuName;
	private int stuAge;
	private String graName;
	private int stuSex;
	private int cardID;
	
	public String getGraName() {
		return graName;
	}
	public void setGraName(String graName) {
		this.graName = graName;
	}
	public int getStuSex() {
		return stuSex;
	}
	public void setStuSex(int stuSex) {
		this.stuSex = stuSex;
	}
	public int getCardID() {
		return cardID;
	}
	public void setCardID(int cardID) {
		this.cardID = cardID;
	}
	public int getStuAge() {
		return stuAge;
	}
	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}
	public int getStuNo() {
		return stuNo;
	}
	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int stuNo, String stuName, int stuAge, String graName, int stuSex, int cardID) {
		super();
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.stuAge = stuAge;
		this.graName = graName;
		this.stuSex = stuSex;
		this.cardID = cardID;
	}
	@Override
	public String toString() {
		return "Student [stuNo=" + stuNo + ", stuName=" + stuName + ", stuAge=" + stuAge + ", graName=" + graName
				+ ", stuSex=" + stuSex + ", cardID=" + cardID + "]";
	}
	
	
	
}
