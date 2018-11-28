package com.collect.sr;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class DateComparision {

	 public static void main(String[] args)
	 {
		 HashMap<Datee, String> hm=new HashMap<Datee,String>();   
			
			
			System.out.println("Initial list of elements: "+hm); 
			
			Datee MadhuDob=new Datee(05,04,2014);
			Datee ChayaDob=new Datee(11,12,2015);
			Datee RashmiDob=new Datee(05,04,2016);
			hm.put(MadhuDob,"Madhu");    
			hm.put(ChayaDob,"Chaya"); 
			hm.put( RashmiDob,"Rashmi"); 
		
	System.out.println(hm);
	System.out.println();
	System.out.println("Name:"+get(MadhuDob,hm ));
	System.out.println("Name:"+get(ChayaDob,hm ));
	System.out.println("Name:"+get(RashmiDob,hm ));	
			
		}

		private static String get(Datee obj,HashMap<Datee, String>  hm) {
		
			Set<Datee> dates=hm.keySet();
			Datee[] d=(Datee[]) dates.toArray(new Datee[0]);
			
			
			for(Datee i:d){
			if(obj.getDd()==i.getDd() && obj.getMm()==i.getMm() && obj.getYyyy()!=i.getYyyy() ){
			return "fail";
			}
		     }
			return (String) hm.get(obj);
	}
	 }
	 
	
	 

