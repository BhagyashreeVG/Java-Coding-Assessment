package com.questions.account;

public class Account {
	private Long accountNumber;
	private String accountHolderName;
	private static Double accountBalance = 1000.00;
	
	public Account() {
		super();
	}
	
	public String deposit(Double amount) {
		this.accountBalance = this.accountBalance + amount;
		return "Amount deposited successfully";
	}
	
	public String withdraw(Double amount) {
		if(amount > this.accountBalance) {
			return "Insufficient funds";
		} else {
			this.accountBalance = this.accountBalance - amount;
			return "Amount withdrawn successfully";
		}
	}
	
	public String showBalance() {
		return "Your current balance is : "+this.accountBalance;
	}

	
	
}
