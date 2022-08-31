package com.example.demo.controllers;

import com.example.demo.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/users")
public class UserController {
	
	private final UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping
	public ResponseEntity<List<User>> getUsers() {
		return ResponseEntity.ok(userService.getUsers());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getUser(@PathVariable Integer id) {
		return ResponseEntity.ok(userService.getUser(id));
	}
	
	@PostMapping
	public ResponseEntity<User> addUser(@Valid @RequestBody User user) {
		return ResponseEntity.ok(userService.addUser(user));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<User> addUser(@PathVariable Integer id, @Valid @RequestBody User user) {
		return ResponseEntity.ok(userService.updateUser(id, user));
	}
	
	@DeleteMapping ("/{id}")
	public ResponseEntity<?> deleteUser(@PathVariable Integer id) {
		return ResponseEntity.ok(userService.deleteUser(id));
	}
}
