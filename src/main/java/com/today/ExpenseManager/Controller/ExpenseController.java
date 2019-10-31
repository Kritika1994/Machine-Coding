package com.today.ExpenseManager.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.today.ExpenseManager.model.Expense;
import com.today.ExpenseManager.service.ExpenseServiceImpl;

@RestController
public class ExpenseController {

	@Autowired
	private ExpenseServiceImpl expenseServiceImpl;
	
	@RequestMapping(method = RequestMethod.POST, value = "/expense-apis")
	public void addExpense(@RequestBody Expense expense) {
		expenseServiceImpl.addExpense(expense);
	}
	

	@RequestMapping(method = RequestMethod.POST, value = "/expense-apis/{id}")
	public void deleteExpense(@PathVariable int id) {
		expenseServiceImpl.deleteExpense(id);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/expense-apis")
	public List<Expense> getAllExpenses() {
		return expenseServiceImpl.getAllExpenses();
	}
}
