package Assignment;

import java.util.ArrayList;
import java.util.List;

public class Lambdaq6 {

	public static void main(String[] args)
	{
		 StringBuilder builder=new StringBuilder();
		
		  Consumer<List<String>> r = words->words.stream()
				  .forEach(w->builder.append(w.charAt(0)));
		  List<String> words=new ArrayList<>();
		  words.add("Madhuri");
		  words.add("Elite");
		  words.add("Lavanya");
		  words.add("Order");
		  words.add("Dayana");
		  words.add("Yes");
		  
		 r.accept(words);
		 System.out.println(builder);
	}

}
