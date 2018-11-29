package com.collect.sr;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Pdemo 
{
	   public static void main(String[] args){
		
	   TreeSet<Person> treeset=new TreeSet<>(new Weight_Comp());
		
		Person person=new Person(10,55.5F,"Akshay");
		Person person1=new Person(5,55.5F,"Vikas");
		Person person2=new Person(30,60.5F,"Sujay");
		Person person3=new Person(40,70.5F,"Ajay");
		
		treeset.add(person);
		treeset.add(person1);
		treeset.add(person2);
		treeset.add(person3);
		
		for( Person p : treeset)
		{
			p.display();
		}
		
		
		TreeSet<> tr=new TreeSet<E>();
	
		
}
}