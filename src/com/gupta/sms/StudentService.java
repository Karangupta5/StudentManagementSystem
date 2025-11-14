package com.gupta.sms;
import java.util.*;

public class StudentService {
	private List<Student> students;
	 public StudentService() {
		 students=new ArrayList<Student>();
	 }
	  public void addStudent(String name,int age,String course) {
		  students.add(new Student(name,age,course));
	  }
	  public List<Student> getAllStudents(){
		return List.copyOf(students);
	  }
	  public Student findStudentByRollNo(int roll_no) {
		  for(Student student:students) {
			  if(student.getRoll_no()==roll_no) return student;
		  }
		return null;
	  }
	  public boolean updateStudent(int rollNo,String newName,Integer newAge,String newCourse) {
		  Student s=findStudentByRollNo(rollNo);
		  if(s==null) return false;
		  s.setName(newName);
		  s.setAge(newAge);
		  s.setCourse(newCourse);
		  return true;
	  }
	  public boolean deleteStudent(int rollNo) {
		  for(Student student:students) {
			  if(student.getRoll_no()==rollNo) { students.remove(student);
			  return true;}
			  }
		  return false;
	  }
	  public void saveToFile(String filename) {
		  
	  }
	  public void loadForms(String filename) {
		  
	  }
}
