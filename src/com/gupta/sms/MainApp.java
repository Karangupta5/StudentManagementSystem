package com.gupta.sms;

public class MainApp {
	public static void main(String args[]) {
		Student s1=new Student("Karan",22,"B.Tech");
		Student s2=new Student("Ritik",24,"MCA");
		
		System.out.println("First Student is"+ s1.toString());
		System.out.println("First Student is"+ s2.toString());
		
		StudentService ss=new StudentService();
		ss.addStudent("Sanchit",24,"B.Tech");
		ss.addStudent("Pratham",24,"Finance");
		System.out.println(ss.getAllStudents());
//		System.out.println(ss.findStudentByRollNo(3).toString());
		ss.addStudent("anmol",24,"MBA");
		ss.addStudent("Manas",23,"PGDM");
		ss.updateStudent(3, "Sagar", 25, "TCP");
		System.out.println(ss.getAllStudents());
		ss.deleteStudent(5);
		System.out.println(ss.getAllStudents());
	}
}
