package com.paulohenrique.academicsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulohenrique.academicsystem.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
