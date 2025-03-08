package com.bala.studentapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.bala.studentapi.entities.Student;
import com.bala.studentapi.repository.StudentRepo;

@RestController
public class StudentController {
	@Autowired
	private StudentRepo repo;
	@RequestMapping(value = "/students/",method = RequestMethod.GET)
	public List<Student> getStudents(){
		return repo.findAll();
	}
	
	// to get a specific product using id 
		@RequestMapping(value = "/students/{id}",method = RequestMethod.GET)
		public Student getStudentById( @PathVariable("id") int id){
			 return repo.findById(id).get();
		}
		
		// to create a new product into db
		@RequestMapping(value = "/students/",method = RequestMethod.POST)
		public Student createStudent(@RequestBody Student student){
			 return repo.save(student);
		}
		
		//to update a product
		@RequestMapping(value = "/students/",method = RequestMethod.PUT)
		public Student updateStudent(  @RequestBody Student  student){
			 return repo.save( student);
		}
		// to delerte a product nbt its id
		
		@RequestMapping(value = "/students/{id}",method = RequestMethod.DELETE)
		public void  deletestudentsById( @PathVariable("id") int id){
			repo.deleteById(id);
		}

}
