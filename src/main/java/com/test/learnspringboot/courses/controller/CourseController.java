package com.test.learnspringboot.courses.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.learnspringboot.courses.bean.Course;

@RestController
public class CourseController {
	
	// http://localhost:8080/courses
	
	@GetMapping("/courses")
	public List<Course> getAllCourses() {
		return Arrays.asList(new Course(1, "Learn Microservices", "ABC"),
				new Course(2, "Learn Java", "XYZ"));
	}
	
	@GetMapping("/courses/1")
	public List<Course> getCourse() {
		return Arrays.asList(new Course(1, "Learn Microservices", "ABC"));
	}

}
