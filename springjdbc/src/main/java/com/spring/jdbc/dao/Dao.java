package com.spring.jdbc.dao;

import com.spring.jdbc.entity.Student;

public interface Dao {
	public int insert(Student s);
	public int update(Student s);
	public int delete(int sid);
	public Student getStudent(int id);
    
}
