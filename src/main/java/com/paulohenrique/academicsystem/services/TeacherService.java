package com.paulohenrique.academicsystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paulohenrique.academicsystem.entities.Teacher;
import com.paulohenrique.academicsystem.repositories.TeacherRepository;


@Service
public class TeacherService {
	@Autowired
	private TeacherRepository repository;
	
	public List<Teacher> findAll(){
		return repository.findAll();
	}
	
	
	public Teacher findById(Long id) {
		Optional<Teacher>obj=repository.findById(id);
		return obj.get();
	}
}
