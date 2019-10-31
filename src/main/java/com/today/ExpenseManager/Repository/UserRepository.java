package com.today.ExpenseManager.Repository;

import org.springframework.data.repository.CrudRepository;

import com.today.ExpenseManager.model.Users;

public interface UserRepository extends CrudRepository<Users,Integer> {

}
