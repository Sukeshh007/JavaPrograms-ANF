package com.inheritancedemo;

public class SavingAccount  extends BankAccount
{

	public SavingAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
		
		}

	public void withdraw(double amount)
	{
		if(getBalance() -amount < 100)  // this condition is a saving account		
		{
			System.out.println("Minimum amout must be 100INR in your saving account");
		}
		else
		{
			super.withdraw(amount);
		}
	
	}


}

