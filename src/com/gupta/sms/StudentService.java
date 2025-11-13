package com.gupta.sms;
import java.util.*;

public class StudentService {
	private List<Student> students;
	 public StudentService() {
		 students=new ArrayList<Student>();
	 }
	  public void addStudent(String name,int age,String course) {
		  
	  }
	  public List<Student> getAllStudents(){
		return students;
	  }
	  public Student findStudentByRollNo(int roll_no) {
		return null;
	  }
	  public boolean updateStudent(int rollNo,String newName,Integer newAge,String newCourse) {
		  
		  return true;
	  }
	  public boolean deleteStudent(int rollNo) {
		  return true;
	  }
	  public void saveToFile(String filename) {
		  
	  }
	  public void loadForms(String filename) {
		  
	  }
}
