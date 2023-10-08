package com.in28minutes.springboot.leanjpaandhibernate.course.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.springboot.leanjpaandhibernate.course.Course;

public interface CourseSpringDataJpa extends JpaRepository<Course, Long>{
	
List<Course> findByAuthor(String author);
List<Course> findByName(String name);
}

