package Assignment;

public class Lambdaq5 {

 public static void main(String[] args)
 {
		  
		  
		 List<String> words = new ArrayList<>();
		  
		  words.add("madhu");
		  words.add("admirable");
		  words.add("dance");
		  words.add("hungry");
		  words.add("useful");
		  
		  
		  System.out.println(words+"\n");
		  	  
		  words.stream()
		  .forEach(w->System.out.println(w.replaceAll(w, w.toUpperCase())));
		  
	}

}
