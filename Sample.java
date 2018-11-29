package com.collect.sr;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class Sample {

	public static void main(String[] args)throws Exception
	{  
		ArrayList lst=new ArrayList();
		lst.add(10);
		lst.add(1);
		lst.add(16);
		lst.add(19);
		lst.add(24);
	//	System.out.println("using list iterator");
	     Iterator itr=lst.listIterator();
	     while(itr.hasNext())
	     {
	    	 System.out.println(itr.next());
	     }
	     ListIterator litr = lst.listIterator();
	      
	      while(litr.hasNext()) {
	         Object element = litr.next();
	         litr.set(element + "+");
	      }
	      System.out.print("Modified contents of lst: ");
	      itr = lst.iterator();
	      
	      while(itr.hasNext()) {
	         Object element = itr.next();
	         System.out.print(element + " ");
	      }
	      System.out.println();
	      // Now, display the list backwards
	      System.out.print("Modified list backwards: ");
	      
	      while(litr.hasPrevious()) {
	         Object element = litr.previous();
	         System.out.print(element + " ");
	      }
	      System.out.println();
	     
	     
	     
	}
}
