package com.paulohenrique.academicsystem.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.paulohenrique.academicsystem.entities.Student;
import com.paulohenrique.academicsystem.repositories.StudentRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private StudentRepository StudentRepository;

	@Override
	public void run(String... args) throws Exception {
		Student student = new Student(null,"Paulo Henrique","paulo@gmail.com","71988882347","Ciência da Computação","1234");
		Student student2 = new Student(null,"Amanda Estefane","amanda@gmail.com","71988882387","Direito","12345");
		StudentRepository.saveAll(Arrays.asList(student,student2));
	}
	
}
