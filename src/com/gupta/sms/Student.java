package com.gupta.sms;

public class Student {
	private int age,roll_no;
	private String name,course;
	
	private static int counter=1;
	
	public Student() {
		
	}
	
	public Student(String name,int age,String course) {
		this.age=age;
		this.course=course;
		this.roll_no=counter++;
		this.name=name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getRoll_no() {
		return roll_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}

//	@Override
	public String toString() {
		return " [roll_no=" + roll_no + ", name=" + name + ", age=" + age + ", course=" + course + "]";
	}
	
	
}
