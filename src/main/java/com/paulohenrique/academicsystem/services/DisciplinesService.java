package com.paulohenrique.academicsystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paulohenrique.academicsystem.entities.Disciplines;
import com.paulohenrique.academicsystem.repositories.DisciplinesRepository;


@Service
public class DisciplinesService {
	@Autowired
	private DisciplinesRepository repository;
	
	public List<Disciplines> findAll(){
		return repository.findAll();
	}
	
	
	public Disciplines findById(Long id) {
		Optional<Disciplines>obj=repository.findById(id);
		return obj.get();
	}
}
