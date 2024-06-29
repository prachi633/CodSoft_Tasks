package com.atm;

public class MainATM {
public static void main(String[] args) {
	
	
	UserBankAccount a=new UserBankAccount(2000);
	ATM m=new ATM(a);
	m.show();
	
}
}
