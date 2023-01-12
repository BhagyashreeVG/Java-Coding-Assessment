package com.question1;

public class Atm {

	public static void main(String[] args) {
		Account account = new Account();
		System.out.println(account.showBalance());
		System.out.println(account.withdraw(2000.00));
		System.out.println(account.deposit(2000.00));
		System.out.println(account.withdraw(2000.00));
		System.out.println(account.showBalance());
		
	}
}
