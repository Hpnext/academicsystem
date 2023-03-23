package com.paulohenrique.academicsystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paulohenrique.academicsystem.entities.Student;
import com.paulohenrique.academicsystem.repositories.StudentRepository;


@Service
public class StudentService {
	@Autowired
	private StudentRepository repository;
	
	public List<Student> findAll(){
		return repository.findAll();
	}
	
	
	public Student findById(Long id) {
		Optional<Student>obj=repository.findById(id);
		return obj.get();
	}
}
