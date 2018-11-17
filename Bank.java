package Assignment;

import java.util.Scanner;

public class Bank {
	
void TotalCash(){
	
}

  public static void main(String[] args)
  {   String name;
      int accno;
      String accname=null;
	  Bank bank=new Bank();
	  SavingAccount savingacc=new SavingAccount();
	  CurrentAccount currentacc=new CurrentAccount();
	  
	  Scanner sc=new Scanner(System.in);
	  
	  System.out.println("Welcome To The Axis Bank");
	  System.out.println("Enter your Name");
	  name=sc.next();
	  
	  System.out.println("Enter your Account Number");
	  accno=sc.nextInt();
	  
	  System.out.println("Account Balnce Checking.....");
	  System.out.println("Which Account Balance you would like to check?");
	  accname=sc.next();
	  if(accname.equals("SavingAccount"))
	  {  savingacc.fixeddeposit();
		 savingacc.totalcash(); 
	  }
	  if(accname.equals("Currentaccount"))
	  {   currentacc.creditcard();
		  currentacc.totalcash();
	  }
  }
	
}


