package com.bala.springboot.thymeleaf.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bala.springboot.thymeleaf.models.Student;


@Controller
public class ThymeleafController {
	@RequestMapping("/hello")
	public String hellothymeleaf() {
		return "hello";
	}
	@RequestMapping("/student")
	public ModelAndView getStudents() {
		ModelAndView mav = new ModelAndView("student");
		Student std1=new Student();
		std1.setName("bla");
		std1.setScore(78);
		mav.addObject("student", std1);
		return mav;
	}
	
	@RequestMapping("/student2")
	public ModelAndView getAllStudents() {
		ModelAndView mav = new ModelAndView("studentList");
		Student std1=new Student();
		std1.setName("bla");
		std1.setScore(78);
		Student std2=new Student();
		std2.setName("blasdgser");
		std2.setScore(786);
		List<Student> students=Arrays.asList(std1,std2);
		mav.addObject("stud", students);
		return mav;
	}
	
	
	@RequestMapping("/studentForm1")
	public ModelAndView getStudentform() {
		ModelAndView mav = new ModelAndView("studentForm");
		Student std1=new Student();
//		std1.setName("bla");
//		std1.setScore(78);
		mav.addObject("studentForm", std1);
		return mav;
	}
	
	
	@RequestMapping("/saveStudent")
	public ModelAndView saveStudent(@ModelAttribute Student s) {
		ModelAndView mav = new ModelAndView("result");
	
		System.out.println(s.getName());
		System.out.println(s.getScore());
		return mav;
	}
	

}
