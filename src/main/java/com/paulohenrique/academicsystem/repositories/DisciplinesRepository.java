package com.paulohenrique.academicsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulohenrique.academicsystem.entities.Disciplines;


public interface DisciplinesRepository extends JpaRepository<Disciplines, Long> {

}
