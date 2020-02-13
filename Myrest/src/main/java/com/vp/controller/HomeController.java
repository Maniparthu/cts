package com.vp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vp.dao.StudentDao;
import com.vp.model.Student;

@RestController
public class HomeController {
	
	@Autowired
	StudentDao dao;
   
	@RequestMapping("/homedata")
	public ResponseEntity<?> getHomeData() {
		
		return new ResponseEntity<Student>(new Student(11,"Giri", "Add1111"), HttpStatus.OK);
			
	}
	
	@GetMapping("/getAllStudent")
	public List<Student> getstudent(){
				
		return dao.getstudent();
	}
	
	@GetMapping("/Student/{id}")
	public ResponseEntity<?> getstudent(@PathVariable("id") int id) {
		return dao.getstudent(id);
	}
	
	@PostMapping("/u")
	public ResponseEntity<?> savestudent(@RequestBody Student Student) {
		return dao.insertstudent(Student);
	}
	
	@DeleteMapping("student/{id}")
	public int deletestudent(@PathVariable("id") int id) {
		return dao.deletestudent(id);
	}
}
