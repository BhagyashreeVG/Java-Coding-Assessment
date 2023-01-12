package com.question7;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		
		User user = new User(101,"Jack","jack@xyz.com",1000.0);
		KycUser kycUser = new KycUser(201,"Jill","jill@xyz.com",3000);
		
		EPayWallet.processPaymentByUser(user, 700);
		EPayWallet.processPaymentByUser(kycUser, 1500);
		EPayWallet.processPaymentByUser(kycUser, 800);
		EPayWallet.processPaymentByUser(kycUser, 1200);
	}

}
