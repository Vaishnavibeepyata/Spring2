package com.in28minutes.springboot.leanjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.in28minutes.springboot.leanjpaandhibernate.course.Course;
@Repository
public class CoursejdbcRepository {
    @Autowired
	private JdbcTemplate Springjdbctemplate;
	 private static String INSERT_QUERY =
			 """
	 		insert into course(id, name, author)
 values(?,?,?);

	 		""";
	 private static String DELETE_QUERY =
			 """
	 		delete from course where 
	 		id= ?;


	 		""";
	 private static String SELECT_QUERY =
			 """
	 		select * from course where 
	 		id= ?;


	 		""";
	public void insert(Course course) {
		Springjdbctemplate.update(INSERT_QUERY, 
				course.getId() ,course.getName(), course.getAuthor());
	}
		public void delete(long id) {
			Springjdbctemplate.update(DELETE_QUERY, 
					id);
	}
		public Course select(long id) {
			return Springjdbctemplate.queryForObject(SELECT_QUERY,
					new BeanPropertyRowMapper<>(Course.class) , id);
					
	}
}
