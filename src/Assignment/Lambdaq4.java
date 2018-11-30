package Assignment;

import java.util.ArrayList;

public class Lambdaq4 {
	public static void main(String[] args) 
	{
	  ArrayList<String> words = new ArrayList<>();
	  
	  words.add("hello");
	  words.add("welcome");
	  words.add("good morning");
	  words.add("good noon");
	  words.add("have a nice day");
	  
	  words.removeIf(word->(word.length()%2)!=0);
	  System.out.println(words);
	  
		
	}


}
