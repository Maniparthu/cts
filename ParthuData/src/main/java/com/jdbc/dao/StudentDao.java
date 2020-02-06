package com.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.jdbc.model.Student;

@Repository("studentDao")
public class StudentDao {
	  JdbcTemplate template;
		
		/*
		 * this method set the JdbcTemplate by the Spring framework.
		 */
		public void setTemplate(JdbcTemplate template) {    
		    this.template = template;    
		}
		 
	    public List<Student>  getAllStudents() {   	
	   	
	    	List<Student> students = template.query(
				    "select * from student",
				    new RowMapper() {         // RowMapper
				        public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				        	Student std = new Student();
				        	std.setId((rs.getInt("id")));
				        	std.setName(rs.getString("name"));
				        	
				            return std;
				        }
				    });
	         return students;
	    }    
	}


