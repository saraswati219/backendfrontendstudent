package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Student;
import com.app.repository.StudentRepositoryI;
@Service
public class StudentService implements StudentServiceI {
	@Autowired
	private StudentRepositoryI sri;

	@Override
	public Student addStudentData(Student stu) {
		Student add=sri.save(stu);
		return add;
	}

	@Override
	public List<Student> getAll() {
		List<Student> list=(List<Student>) sri.findAll();
		return list;
	}
	
	@Override
	public Student getSingleStudent(int id) {
		
		Optional op = sri.findById(id);
		
		if(op.isPresent())
		{
			Student stud = (Student) op.get();
			return stud;
		}
		return null;
		
	
	}

	@Override
	public Student updateStudent(Student stu) {
		Student stud=sri.save(stu);
		return stud;
	}

	@Override
	public List<Student> deleteStudentData(int id) {
		sri.deleteById(id);
		List<Student> list=(List<Student>)sri.findAll();
		return null;
	}

	
	
	}
		
		
		

