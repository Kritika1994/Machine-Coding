package com.today.ExpenseManager.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.today.ExpenseManager.Repository.UserRepository;
import com.today.ExpenseManager.model.Users;

@Service
public class UserServiceImpl {

	@Autowired
	private UserRepository userRepository;
	
	public void addUser(Users u) {
		userRepository.save(u);
	}

	public List<Users> getUsers() {
		List<Users> users = new ArrayList();
		userRepository.findAll().forEach(users::add);
		return users;
	}

	public void editUser(Users u) {
		userRepository.save(u);
		
	}

	public void deleteUser(int id) {
		userRepository.deleteById(id);
	}

	
	
}
