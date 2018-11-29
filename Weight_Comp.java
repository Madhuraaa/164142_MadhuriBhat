package com.collect.sr;

import java.util.Comparator;

public class Weight_Comp implements Comparator<Person>{

	public int compare(Person p1,Person p2) {
		
		if(p1.getWeight() > p2.getWeight())
		{
			return 1;
		}
		else if(p1.getWeight() == p2.getWeight())
		{
			if(p1.getHeight() > p2.getHeight())
				
			{
				return 1;
			}
			else
				return -1;
		}
		
		return -1;
	}

}