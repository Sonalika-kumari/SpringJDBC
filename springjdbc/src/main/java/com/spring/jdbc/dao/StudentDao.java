package com.spring.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.entity.Student;

public class StudentDao implements Dao{
	
	private  JdbcTemplate jdbctemp;
	 
	public JdbcTemplate getJdbctemp() {
		return jdbctemp;
	}

	public void setJdbctemp(JdbcTemplate jdbctemp) {
		this.jdbctemp = jdbctemp;
	}

	public StudentDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentDao(JdbcTemplate jdbctemp) {
		super();
		this.jdbctemp = jdbctemp;
	}

	
	public int insert(Student s) {
		// TODO Auto-generated method stub
   		
		 String query="insert into student(id,name,city) values(?,?,?)"; 
		  
		   int result=jdbctemp.update(query,s.getId(),s.getName(),s.getCity());
		 
		 return 1;
	}

	;
	public int update(Student s) {

		 String query="update student set name=?,city=? where id=?"; 
		  
		   int result=jdbctemp.update(query,s.getName(),s.getCity(), s.getId());
		return result;
	}

	public int delete(int sid) {

		 String query="delete from student where id=?"; 
		  
		   int result=jdbctemp.update(query,sid);
		
		return result;
	}



}
