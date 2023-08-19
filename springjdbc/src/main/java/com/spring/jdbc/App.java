package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entity.Student;

/**
 * Hello world!
 *
 */
public class App  
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
//        
//        jdbcTemplate
//        JdbcTemplate
        
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        StudentDao dao=(StudentDao)context.getBean("studao");   
//        
//        Student student=new Student();
//        student.setId(98);
//        student.setCity("panjab");
//        student.setName("suresh");
//       int ans= dao.insert(student);
//       System.out.println(ans);
//     
//	    
        
      //...........update operation.//////////////
//        Student student=new Student();
//       student.setId(98);
//        student.setCity("panjabb");
//      student.setName("suresh");
//     int ans= dao.update(student); 
//     System.out.println(ans);
   
	//    System.out.println("after insertion");
//	  
//	    
//		  String query="insert into student(id,name,city) values(?,?,?)"; 
//		  
//		   int result=temp.update(query,457,"saurav","bihar");
//		   System.out.println(result);
//		   
//	
	    
//	    //...........delete operation.....///
//	     int ans= dao.delete(98); 
//	     System.out.println(ans);
//	   
        //select single data
       Student s= dao.getStudent(1);
       System.out.println(s);
    }
}
