package com.paulohenrique.academicsystem.config;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.paulohenrique.academicsystem.entities.Disciplines;
import com.paulohenrique.academicsystem.entities.Student;
import com.paulohenrique.academicsystem.entities.Teacher;
import com.paulohenrique.academicsystem.repositories.DisciplinesRepository;
import com.paulohenrique.academicsystem.repositories.StudentRepository;
import com.paulohenrique.academicsystem.repositories.TeacherRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private DisciplinesRepository disciplinesRepository;
	@Autowired
	private TeacherRepository teacherRepository;

	@Override
	public void run(String... args) throws Exception {
		Student student = new Student(null,"Paulo Henrique","paulo@gmail.com","71988882347","Ciência da Computação","1234",7.0);
		
		Student student2 = new Student(null,"Amanda Estefane","amanda@gmail.com","71988882387","Direito","12345",7.0);
		Student student3 = new Student (null, "Adilson Santos","adilson@gmail.com","71977778542","Ciência da Computação","5585",6.0);
		studentRepository.saveAll(Arrays.asList(student,student2,student3));
		
		List<Student> studentList= new ArrayList<>();
		studentList.add(student);
		studentList.add(student3);
		Disciplines disciplines = new Disciplines(null,"Calculo A", 120,null,studentList);
		List<Disciplines> disciplinesList = new ArrayList<>();
		disciplinesList.add(disciplines);
		
		Teacher teacher = new Teacher(null,"Carlos Alberto","Ciência e Tecnologia",disciplinesList);
		disciplines.setTeacher(teacher);
		Teacher teacher2 = new Teacher(null,"Ricardo Bravo","Direito",null);
		
		
		
		teacherRepository.saveAll(Arrays.asList(teacher,teacher2));
		disciplinesRepository.saveAll(Arrays.asList(disciplines));
	}
	
	
	
}
