package com.bala.springdatajpa;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bala.springdatajpa.entities.Student;
import com.bala.springdatajpa.repos.StudentRepository;

@SpringBootTest
class SpringdatajpaApplicationTests {
  @Autowired
   private StudentRepository repo;
 
	@Test
	void testSavedStudent() {
		Student st=new Student();
		st.setId(1l);
		st.setName("bala");
		st.setTestScore(100);
		repo.save(st);
		Student savedst=repo.findById(1l).get();
		assertNotNull(savedst);
		
	}

}
