package com.paulohenrique.academicsystem.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paulohenrique.academicsystem.entities.Teacher;
import com.paulohenrique.academicsystem.services.TeacherService;

@RestController
@RequestMapping(value="/teachers")
public class TeacherResource {
	
	 @Autowired
	 private TeacherService service;
	@GetMapping
	public ResponseEntity<List<Teacher>> findAll(){
		
		List<Teacher> list = service.findAll();
		//Teacher student = new Teacher (1L,"Paulo","paulo@gmail.com","71988886321","Ciencia da Computação","12345");
		return ResponseEntity.ok().body(list);
	}
	@GetMapping(value="/{id}")
	public ResponseEntity<Teacher>findById(@PathVariable Long id){
		
		Teacher obj=service.findById(id);
		return ResponseEntity.ok().body(obj);
		
	}
	
	
}
