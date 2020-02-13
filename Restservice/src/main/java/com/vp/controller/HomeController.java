package com.vp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vp.UserDao;

@RestController
public class HomeController {
	@Autowired
	UserDao dao;
   
	@RequestMapping("/homedata")
	public ResponseEntity<?> getHomeData() {
		
		return new ResponseEntity<User>(new User(11,"Giri", "Add1111"), HttpStatus.OK);
			
	}
	
	@GetMapping("/getAllUsers")
	public List<User> getUsers(){
				
		return dao.getUsers();
	}
	
	@GetMapping("/user/{id}")
	public ResponseEntity<?> getUser(@PathVariable("id") int id) {
		return dao.getUser(id);
	}
	
	@PostMapping("/user")
	public ResponseEntity<?> saveUser(@RequestBody User user) {
		return dao.insertUser(user);
	}
	
	@DeleteMapping("user/{id}")
	public int deleteUser(@PathVariable("id") int id) {
		return dao.deleteUser(id);
	}
}
