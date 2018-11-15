package com.madhuri.bank;//collection of logical classes

public class BankAccount {
	//static variable
	private static int autoAccountNo;
	
	
	
	//instance variable /class variable
	//we cannot access instance variable if we are not creating object 
	private  int accountNo;
	private String accountHolderName;
	private double accountBalance;
	
	//init block //executes well before construcctor
	{
		accountNo=++autoAccountNo;
	}
	
	//constructor overloading
	//default constructor 
	public BankAccount(){
		
		accountHolderName="Unknown";
		accountBalance=0;
		
	}
	//Parameterized constructor
	
	public BankAccount(String accoutnHolderName,double accountBalance){
	
			this.accountHolderName = accountHolderName;
		this.accountBalance=accountBalance;
	
		
	}// setter---modifyng/reinitializing member value
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	
	//getter method  
	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}
	//service method 
   public void withdraw(double amount){
	   this.accountBalance=amount;
   }
   public void deposit (double amount)
   {
	   
   }
	public static void main(String args[])
	{   
		BankAccount acc=new BankAccount();
		
	}
	
}
