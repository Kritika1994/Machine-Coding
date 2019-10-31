package com.today.ExpenseManager.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.today.ExpenseManager.Repository.ExpenseRepository;
import com.today.ExpenseManager.model.Expense;

@Service
public class ExpenseServiceImpl {

	@Autowired
	private ExpenseRepository expenseRepository;
	
	public void addExpense(Expense expense) {
		expenseRepository.save(expense);
		
	}

	public void deleteExpense(int id) {
		expenseRepository.deleteById(id);
		
	}

	public List<Expense> getAllExpenses() {
		List<Expense> expenses = new ArrayList();
		expenseRepository.findAll().forEach(expenses::add);
		return expenses;
	}

}
