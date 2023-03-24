package com.paulohenrique.academicsystem.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paulohenrique.academicsystem.entities.Disciplines;
import com.paulohenrique.academicsystem.services.DisciplinesService;

@RestController
@RequestMapping(value="/disciplines")
public class DisciplinesResource {
	
	 @Autowired
	 private DisciplinesService service;
	@GetMapping
	public ResponseEntity<List<Disciplines>> findAll(){
		
		List<Disciplines> list = service.findAll();
		//Disciplines student = new Disciplines (1L,"Paulo","paulo@gmail.com","71988886321","Ciencia da Computação","12345");
		return ResponseEntity.ok().body(list);
	}
	@GetMapping(value="/{id}")
	public ResponseEntity<Disciplines>findById(@PathVariable Long id){
		
		Disciplines obj=service.findById(id);
		return ResponseEntity.ok().body(obj);
		
	}
	
	
}
