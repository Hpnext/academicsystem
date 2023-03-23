package com.paulohenrique.academicsystem.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paulohenrique.academicsystem.entities.Student;
import com.paulohenrique.academicsystem.services.StudentService;

@RestController
@RequestMapping(value="/students")
public class StudentResource {
	
	 @Autowired
	 private StudentService service;
	@GetMapping
	public ResponseEntity<List<Student>> findAll(){
		
		List<Student> list = service.findAll();
		//Student student = new Student (1L,"Paulo","paulo@gmail.com","71988886321","Ciencia da Computação","12345");
		return ResponseEntity.ok().body(list);
	}
	@GetMapping(value="/{id}")
	public ResponseEntity<Student>findById(@PathVariable Long id){
		
		Student obj=service.findById(id);
		return ResponseEntity.ok().body(obj);
		
	}
	
	
}
