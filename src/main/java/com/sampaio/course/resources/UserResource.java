package com.sampaio.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sampaio.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll(){
		User user = new User(1L, "Jefferson Sampaio", "jeffersonsamp@gmail.com", "98988883256", "123456");
		
		return ResponseEntity.ok().body(user);
	}
}
