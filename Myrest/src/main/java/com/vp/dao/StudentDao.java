package com.vp.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;


import com.vp.model.Student;

@Component
public class StudentDao {
	static List<Student> list =null;
	static {		
		list = new ArrayList<Student>(); 
		list.add(new Student(1, "Anil", "Mang"));
		list.add(new Student(2, "Aji", "Mang2"));
		list.add(new Student(3, "Sanal", "Pralin"));
		list.add(new Student(4, "Nibin", "Raj"));
	
	}
	public List<Student> getstudent(){		
		
		return StudentDao.list;
	}	
	public ResponseEntity<?> insertstudent(Student Student){
		list.add(Student);		
		return new ResponseEntity<Student>(Student, HttpStatus.OK);
	}
	public ResponseEntity<?> getstudent(int id){
		for (Student student : list) {
			if(student.getUid() == id) {
				return new ResponseEntity<Student>(student, HttpStatus.OK);
			}
		}
		return null;
	}
	public int deletestudent(int id){
		for (Student student : list) {
			if(student.getUid() == id) {
				list.remove(student);
				return id;
			}
		}
		return 0;
	}
	
	}
