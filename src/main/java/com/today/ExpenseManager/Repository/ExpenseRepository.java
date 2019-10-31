package com.today.ExpenseManager.Repository;

import org.springframework.data.repository.CrudRepository;

import com.today.ExpenseManager.model.Expense;

public interface ExpenseRepository  extends CrudRepository<Expense,Integer>{

}
