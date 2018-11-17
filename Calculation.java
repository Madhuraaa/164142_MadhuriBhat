package Assignment;

import java.util.Scanner;

public class Calculation {

	public static void main(String[]args)
	{   Employee employee=new Employee();
	    Manager manager=new Manager();
	    Labour labour=new Labour();
	    
	    double Salary;
	    String name;
	    int Empid;
	    String designation=null;
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter your name");
	    name=sc.nextLine();
	    System.out.println("Enter your Empid");
	    Empid=sc.nextInt();
	    System.out.println("Enter the Designation");
	    designation=sc.next();
	    if(designation.equals("Manager"))
	    { manager.totalSalary();}
	    else if(designation.equals("Labour"))
	    {labour.totalSalary();}
	    else if(designation.equals("null"))
	    { employee.totalSalary();}


}}
