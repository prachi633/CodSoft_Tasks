package com.atm;
import java.util.Scanner;

public class ATM {

	private UserBankAccount account;
	
	public ATM(UserBankAccount account) 
	{
		this.account=account;
	}
	public void show() {
		Scanner sc=new Scanner(System.in);
		
		int menu = 0;
		do {
			System.out.println("Enter your pin: ");
			 String pin = sc.next();
			if(validatePIN(pin)) {
				System.out.println("your pin is correct");
				
			}
			else{
				System.out.println("your pin is incorrect");
				break;
			}
		
			System.out.println("Account Type (Current account or Saving account");
			String c=sc.next();
			
			System.out.println("ATM Options");
			System.out.println("1.Deposit");
			System.out.println("2.Withdrawn");
			System.out.println("3.check");
			System.out.println("4 exit");
			 
			System.out.println("choose an option");
			menu=sc.nextInt();
			
			switch(menu) {
			case 1:
			
				System.out.println("Enter a amount to Deposit your bank  account");
				double depositAmount=sc.nextDouble();
				account.deposit(depositAmount);
				break;
			
			case 2:
			
				System.out.println("Enter a amount to withdraw your bank account");
				double withdrawAmount=sc.nextDouble();
				account.withdraw(withdrawAmount);
				break;
			
			case 3:
			
				System.out.println("Current balnce: "+account.checkbalnce(menu));
				
				break;
				
			
			case 4:
			
				System.out.println("Exit.....");
			    break;
			    
			default:
			
			System.out.println("Invalid choice");	
			}
		
		}
		while(menu!=4);
				
				sc.close();
		
	}
	private boolean validatePIN(String pin) {
		// TODO Auto-generated method stub
		 return pin.matches("\\d{4}");
	}
	
}
