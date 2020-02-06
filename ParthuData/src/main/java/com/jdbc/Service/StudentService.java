package com.jdbc.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdbc.dao.StudentDao;
import com.jdbc.model.Student;

@Service
public class StudentService {

 
	
	@Autowired
	StudentDao studentDao;
	
    public List<Student> getAllStudents(){
    	return studentDao.getAllStudents();
    }
}

