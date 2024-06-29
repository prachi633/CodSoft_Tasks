package com.atm;

public class UserBankAccount {

	private double balance;
	
	public UserBankAccount(int currentbalance) {
		this.balance=currentbalance;
	}
	public double  checkbalnce(double checkAmount) {
		return balance;
		
	}
	
	public void deposit(double amount) {
		if(amount>0) {
			
		balance=balance+amount;
		System.out.println("**Cash Deposited to your Bank Account**");	
	  }
		else {
			System.out.println("Invalid Deposit Amount");
		}
	}
		
	public boolean withdraw(double amount) {
		if(amount>0 && amount<=balance) {
		balance=balance-amount;
		System.out.println("Cash Withdrawn to your account :" +amount);
		return true;
		}
		else if(amount>balance) {
			System.out.println("Insufficent amount");
		}
		else {
			System.out.println("Withdrawn cash is invaild");
		}
		return false;
		
	}
	public String checkBalance() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
