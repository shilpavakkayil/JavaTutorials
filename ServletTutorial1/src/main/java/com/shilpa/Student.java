package com.shilpa;

public class Student {
	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	int rollno;
	String name;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student ID:"+rollno+"Name"+name;
	}
}
