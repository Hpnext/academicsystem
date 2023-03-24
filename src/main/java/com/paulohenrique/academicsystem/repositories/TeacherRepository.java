package com.paulohenrique.academicsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulohenrique.academicsystem.entities.Teacher;


public interface TeacherRepository extends JpaRepository<Teacher, Long> {

}
