package com.gupta.sms;
import java.util.*;


public class MainApp {
	
	private static String readNonEmptyString(Scanner sc, String prompt) {
	    String input;
	    while (true) {
	        System.out.print(prompt);
	        input = sc.nextLine().trim();

	        if (!input.isEmpty()) {
	            return input;
	        }

	        System.out.println("Input cannot be empty. Please try again.");
	    }
	}
	
	private static int readInt(Scanner sc, String prompt) {
	    while (true) {
	        System.out.print(prompt);
	        String input = sc.nextLine().trim();

	        try {
	            return Integer.parseInt(input);
	        } catch (NumberFormatException e) {
	            System.out.println("Invalid number! Please enter a valid integer.");
	        }
	    }
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		StudentService ss=new StudentService();
		Student st=new Student();
		
		boolean check=true;
		while(check) {
		System.out.println("Enter your choice:\r\n"
				+ "1. Add student\r\n"
				+ "2. View all students\r\n"
				+ "3. Search student by roll no\r\n"
				+ "4. Update student\r\n"
				+ "5. Delete student\r\n"
				+ "6. Save students to file\r\n"
				+ "7. Load students from file\r\n"
				+ "8. Exit");
		int ch=readInt(sc, "Enter choice: ");
		switch(ch) {
		case 1:{
			String name=readNonEmptyString(sc, "Enter name: ");
			int age=readInt(sc, "Enter age: ");
			String course=readNonEmptyString(sc, "Enter course: ");
			ss.addStudent(name,age,course);
			System.out.println("Student added successfully with rollNo "+ (st.getCounter()-1) + "\n");
			break;
		}
		case 2:{
			System.out.println(ss.getAllStudents());
			System.out.println();
			break;
		}
		case 3:{
			int rollNo=readInt(sc, "Enter rollNo: ");
			if(ss.findStudentByRollNo(rollNo)!=null) System.out.println(ss.findStudentByRollNo(rollNo).toString());
			else System.out.println("rollNo didn't exit");
			System.out.println();
			break;
		}
		case 4:{
			int rollNo=readInt(sc, "Enter rollNo you want to update: ");
			int newAge=readInt(sc, "Enter newAge: ");
			String newName=readNonEmptyString(sc, "Enter newName: ");
			String newCourse=readNonEmptyString(sc, "Enter newCourse: ");
			System.out.println(ss.updateStudent(rollNo,newName,newAge,newCourse));
			System.out.println();
			break;
		}
		case 5:{
			char c=readNonEmptyString(sc, "Confirm to delete (y/n)? ").charAt(0);
			if(c=='y') {
			System.out.println("Enter the rollNo of the student you want to delete");
			int rollNo=readInt(sc, "Enter rollNo: ");
			if(ss.deleteStudent(rollNo)) System.out.println("Deletion successfull \n");
			else System.out.println("Invalid rollNo \n");}
			else System.out.println("Operation Terminated \n");
			break;
		}
		case 8:{
			check=false;
			System.out.println("EXIT Successfully");
			break;
		}
		default:{
			System.out.println("You entered wrong choice");
		}
		}
	}
}
}
