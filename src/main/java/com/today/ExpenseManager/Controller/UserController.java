package com.today.ExpenseManager.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.today.ExpenseManager.model.Users;
import com.today.ExpenseManager.service.UserServiceImpl;

@RestController
public class UserController {
	
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@RequestMapping(method = RequestMethod.POST , value = "/user-apis")
	public void addUser(@RequestBody Users u) {
		userServiceImpl.addUser(u);
	}
	
	@RequestMapping(method = RequestMethod.GET , value = "/user-apis", produces = {"application/json"})
	public List<Users> getUsers(){
		return userServiceImpl.getUsers();
	}
	
	@RequestMapping(method = RequestMethod.PUT , value = "/user-apis")
	public void editUser(@RequestBody Users u){
		userServiceImpl.editUser(u);
	}


	@RequestMapping(method = RequestMethod.DELETE , value = "/user-apis/{id}")
	public void deleteUser(@PathVariable int id){
		userServiceImpl.deleteUser(id);
	}
}
