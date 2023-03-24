package com.paulohenrique.academicsystem.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name= "tb_disciplines")
public class Disciplines implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Integer workLoad;
	@JsonIgnore
	@ManyToOne()
	@JoinColumn(name="teacher_id")
	private Teacher teacher;
	//
	@ManyToMany
	@JoinColumn(name="student_id")
	private List<Student> student =new ArrayList<>();
	

	public Disciplines () {
		
	}

	public Disciplines(Long id,String name, Integer workLoad, Teacher teacher, List<Student> student) {
		super();
		this.id=id;
		this.name = name;
		this.workLoad = workLoad;
		this.teacher = teacher;
		this.student=student;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getWorkLoad() {
		return workLoad;
	}

	public void setWorkLoad(Integer workLoad) {
		this.workLoad = workLoad;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	
	
	public List<Student> getStudent() {
		return student;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, teacher, workLoad);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplines other = (Disciplines) obj;
		return Objects.equals(name, other.name) && Objects.equals(teacher, other.teacher)
				&& Objects.equals(workLoad, other.workLoad);
	}

	
}
