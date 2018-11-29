package com.collect.sr;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;

public class EmpTest {
	
	 public static void main(String[] args) {
		 Hashtable<Employee,String> map=new Hashtable<>();
	        Employee employee = new Employee("rajeev", 24);
          Employee employee1 = new Employee("rajeev", 25);
         Employee employee2 = new Employee("rajeev", 24);
           map.put(employee, "hjh");
           map.put(employee1, "hjh");
           map.put(employee2, "hjh");
	       
           System.out.println(employee.hashCode());
           System.out.println(employee.equals(employee2));
	      
	
	       
	       
	    }

}
