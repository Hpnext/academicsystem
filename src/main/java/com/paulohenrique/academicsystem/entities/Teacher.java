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
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name= "tb_teachers")
public class Teacher implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String trainingArea;
	//@JsonIgnore
	@ManyToMany(mappedBy="teacher")
    private List<Disciplines> disciplines =new ArrayList<>();
    
    public Teacher() {
    	
    }

	public Teacher(Long id, String name, String trainingArea, List<Disciplines> disciplines) {
		super();
		this.id=id;
		this.name = name;
		this.trainingArea = trainingArea;
		this.disciplines = disciplines;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTrainingArea() {
		return trainingArea;
	}

	public void setTrainingArea(String trainingArea) {
		this.trainingArea = trainingArea;
	}

	public List<Disciplines> getDisciplines() {
		return disciplines;
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(disciplines, name, trainingArea);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teacher other = (Teacher) obj;
		return Objects.equals(disciplines, other.disciplines) && Objects.equals(name, other.name)
				&& Objects.equals(trainingArea, other.trainingArea);
	}

	
    
    

}
