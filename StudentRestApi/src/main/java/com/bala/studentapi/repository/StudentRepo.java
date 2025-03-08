package com.bala.studentapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bala.studentapi.entities.Student;

public interface StudentRepo  extends JpaRepository<Student, Integer>{

}
