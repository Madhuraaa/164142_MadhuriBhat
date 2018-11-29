package com.collect.sr;

import java.util.ArrayList;
import java.util.ListIterator;

public class IteratorDemo {
	public static void main(String[] args){
		
		ArrayList lst=new ArrayList();
		lst.add(1);
		lst.add(null);
		lst.add(21);
		lst.add("Madhu");
		lst.add(21.8);
		
		System.out.println(lst);
		
		ListIterator litr=lst.listIterator(lst.size());
//		
//		while(litr.hasNext()){
//	    System.out.print(litr.next()+" ");
//	    }
//		
        System.out.println();
	    
		while(litr.hasPrevious())
		{
			System.out.print(litr.previous()+" ");
		}
		System.out.println();
		
		System.out.println(lst.indexOf(1));
	    System.out.println(lst.contains(21.8));
	}
}
