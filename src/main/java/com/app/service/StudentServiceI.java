package com.app.service;

import java.util.List;

import com.app.model.Student;

public interface StudentServiceI {
	//createdata
public Student addStudentData(Student stu);
	
	//retrieve
	public List<Student> getAll();
	
	//single id
	public Student getSingleStudent(int id);
	
	//Update
	public Student updateStudent(Student stu);
	
	//Delete
	public List<Student> deleteStudentData(int id);

}
