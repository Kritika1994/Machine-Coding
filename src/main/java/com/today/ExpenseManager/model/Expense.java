package com.today.ExpenseManager.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

enum ExpenseType 
{ 
    EQUAL, PARTS, PERCENTAGE, EXACT; 
} 
@Entity
public class Expense {
	@Id
	int id;
	
	int totalAmount;
	String currency;
	ExpenseType type;
	@ManyToOne
	Users paidByUser;
//	List<Split> splits;
	
	public Expense(int id, int totalAmount, String currency, ExpenseType type, Users paidByUser) {
		super();
		this.id = id;
		this.totalAmount = totalAmount;
		this.currency = currency;
		this.type = type;
		this.paidByUser = paidByUser;
	}
	public Expense() {
	
	}
	public Users getPaidByUser() {
		return paidByUser;
	}
	public void setPaidByUser(Users paidByUser) {
		this.paidByUser = paidByUser;
	}
	public void setId(int id) {
		this.id = id;
	}
//	public Expense(int totalAmount, String currency, ExpenseType type, List<Split> splits) {
//		super();
//		this.totalAmount = totalAmount;
//		this.currency = currency;
//		this.type = type;
////		this.splits = splits;
//	}
	public int getId() {
		return id;
	}
	public int getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public ExpenseType getType() {
		return type;
	}
	public void setType(ExpenseType type) {
		this.type = type;
	}
//	public List<Split> getSplits() {
//		return splits;
//	}
//	public void setSplits(List<Split> splits) {
//		this.splits = splits;
//	}
//	
	

}
