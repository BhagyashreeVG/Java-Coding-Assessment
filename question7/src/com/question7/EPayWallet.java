package com.question7;

public class EPayWallet {
	public static void processPaymentByUser(User user, double amount) {
		boolean success = user.makePayment(amount);
		if (success) {
			System.out.println("--------------------------------------------------------");
			System.out.println("Congratulations "+user.getUserName()+ " payment of "+amount+ " was successfull");
			System.out.println("Your wallet balance is: "+user.getWalletBalance());
		}
		else {
			System.out.println("--------------------------------------------------------");
			System.out.println("Sorry "+user.getUserName()+" not enough balance to make payment");
			System.out.println("Your wallet balance is: "+user.getWalletBalance());
		}
		
		if (user instanceof KycUser)
			System.out.println("You havt: "+ ((KycUser) user).getRewarPoints()+ " reward points");
		// System.out.println("You have " + this.rewarPoints + " reward points");
	}
}
