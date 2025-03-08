package com.bala.springdatajpa.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bala.springdatajpa.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
