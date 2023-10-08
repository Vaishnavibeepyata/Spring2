package com.in28minutes.springboot.leanjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.springboot.leanjpaandhibernate.course.springdatajpa.CourseSpringDataJpa;


@Component
public class CourseCommandLineRunner implements CommandLineRunner {


	//@Autowired
	//private CoursejdbcRepository repository;
	
	//@Autowired
	//private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataJpa repository;
	
	@Override
	public void run(String... args) throws Exception {
		
		repository.save(new Course(1, "learn AwsSpringjpa","28mins"));
		repository.save(new Course(2, "learn AzureSpringjpa","28mins"));
		repository.save(new Course(3, "learn deveopsSpringjpa","28mins"));
		repository.deleteById(1l);		
		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));
		System.out.println(repository.findAll());
		
		System.out.println(repository.findByAuthor("28mins"));
		System.out.println(repository.findByAuthor(""));
		System.out.println(repository.findByName("learn AzureSpringjpa"));
		System.out.println(repository.findByName("learn deveopsSpringjpa"));
		
	}
	

}
