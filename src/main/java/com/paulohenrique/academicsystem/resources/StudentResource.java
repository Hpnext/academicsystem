package com.paulohenrique.academicsystem.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paulohenrique.academicsystem.entities.Student;

@RestController
@RequestMapping(value="/students")
public class StudentResource {
	@GetMapping
	public ResponseEntity<Student> findAll(){
		Student student = new Student (1L,"Paulo","paulo@gmail.com","71988886321","Ciencia da Computação","12345");
		return ResponseEntity.ok().body(student);
	}
	
	
}
