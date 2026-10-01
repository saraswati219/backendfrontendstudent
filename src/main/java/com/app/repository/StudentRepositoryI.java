package com.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.app.model.Student;

public interface StudentRepositoryI extends CrudRepository<Student,Integer>{

}
