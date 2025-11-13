package com.gupta.sms;

public class MainApp {
	public static void main(String args[]) {
		Student s1=new Student("Karan",22,"B.Tech");
		Student s2=new Student("Ritik",24,"MCA");
		
		System.out.println("First Student is"+ s1.toString());
		System.out.println("First Student is"+ s2.toString());
	}
}
