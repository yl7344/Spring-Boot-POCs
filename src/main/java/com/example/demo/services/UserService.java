package com.example.demo.services;

import com.example.demo.models.User;
import com.example.demo.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

	private final UserRepository userRepository;
	
	public List<User> getUsers() {
		return userRepository.findAll();
	}
	
	public Optional<User> getUser(Integer id) {
		return userRepository.findById(id);
	}
	
	public User addUser(User user) {
		return userRepository.save(user);
	}
	
	public boolean isUserExisted(Integer id) {
		return userRepository.existedById(id);
	}
	
	public boolean updateUser(Integer id, User user) {
		if (this.isUserExisted(id) && user.getId() == id) {
			userRepository.deleteById(id);
			userRepository.save(user);
			return true;
		}else {
			return false;
		}
	}
	
	public boolean deleteUser(Integer id) {
		if (this.isUserExisted(id) ) {
			userRepository.deleteById(id);
			return true;
		}else {
			return false;
		}
	}
	
}
