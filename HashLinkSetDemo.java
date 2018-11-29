package com.collect.sr;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;



class HashLinkSetDemo
{
	public static void main(String[] args){
		Set<String> s1=new HashSet<>();
		s1.add("Madhuri");
		s1.add("Sindhu");
		s1.add("Chaya");
		s1.add("Rashmi");
		s1.add("Arpita");
		s1.add("Mallika");
		for(String str:s1)
		{
			System.out.print(str+" ");
		}
		System.out.println(); 
		
		Set<String> s2=new LinkedHashSet<String>();
		s2.add("Madhuri");
		s2.add("Sindhu");
		s2.add("Chaya");
		s2.add("Rashmi");
		s2.add("Arpita");
		s2.add("Mallika");
		
			System.out.print(s2+" ");
		
	}
}
