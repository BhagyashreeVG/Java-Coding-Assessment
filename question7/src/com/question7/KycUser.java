package com.question7;

public class KycUser extends User{
	private int rewarPoints;
	
	public KycUser(int id, String userName, String email, double walletBalance) {
		super(id, userName, email, walletBalance);
	}

	@Override
	public boolean makePayment(double amount) {
	  boolean success = super.makePayment(amount);
	  int rAmount;
	  if(success) {
		  rAmount = (int) (amount/10);
		  this.rewarPoints = this.rewarPoints + rAmount;
		 //  balance = balance + this.rewarPoints;
		  // super.setWalletBalance(balance);
		  
		  return true;
	  }
	  return false;
	}

	public int getRewarPoints() {
		return rewarPoints;
	}

	public void setRewarPoints(int rewarPoints) {
		this.rewarPoints = rewarPoints;
	}
}
