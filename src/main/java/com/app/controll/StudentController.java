package com.app.controll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Student;
import com.app.service.StudentServiceI;
@CrossOrigin("*")
@RestController
public class StudentController {
	@Autowired
	private StudentServiceI ssi;
	
	@PostMapping("/student")
	public Student createStudentData(@RequestBody Student stu) {
		Student stud = ssi.addStudentData(stu);
		return stud;
	}
	
	@GetMapping("/get")
	public List<Student> getAllStudent(){
		List<Student> all = ssi.getAll();
		
		return all;
		
	}
	
	@GetMapping("/single/{id}")
	public Student getStudent(@PathVariable("id") int id) {
		Student stud = ssi.getSingleStudent(id);
		return stud;
		
	}
	
	@PutMapping("/update")
	public Student updateStudent(@RequestBody Student stu) {
		Student stud = ssi.updateStudent(stu);
		return stud;
	}
	
	@DeleteMapping("delete/{id}")
	public List<Student> deleteStudent(@PathVariable("id") int id){
		List<Student> data = ssi.deleteStudentData(id);
		return data;
	}
	

}
