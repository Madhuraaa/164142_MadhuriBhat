package AssignmentStrem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Transs {
	public static void main(String[] args) {
		List<Transaction> transaction = new ArrayList<>();
		List<Trader> trader=new ArrayList<>();
	    transaction.add(new Transaction(new Trader("Madhuri", "Bangalore"), 2011, 10000));
		transaction.add(new Transaction(new Trader("Sindhu", "Pune"), 2011, 70000));
		transaction.add(new Transaction(new Trader("Chaya", "Mumbai"), 2012, 50000));
		transaction.add(new Transaction(new Trader("Sneha", "Mumbai"), 2000, 30000));
		transaction.add(new Transaction(new Trader("Rashmi", "Delhi"), 2010, 20000));
		transaction.add(new Transaction(new Trader("Aashutosh", "Chennai"), 2011, 30000));
		transaction.add(new Transaction(new Trader("Arpita", "Mumbai"), 2002, 50000));
		transaction.add(new Transaction(new Trader("Mallika", "Pune"), 2011, 90000));
		transaction.add(new Transaction(new Trader("Parthiban", "Pune"), 2011, 80000));
		transaction.add(new Transaction(new Trader("Jagadish", "Delhi"), 2011, 30000));
		
		System.out.println("------Question 8----------");
		transaction.stream().filter(r->r.getYear()==2011)
		.sorted(Comparator.comparing(Transaction::getValue))
		.map(r->r.getTrader()+ ":"+ r.getYear())
		.forEach(System.out::println);
		
		
		System.out.println("-------Question9--------");
		transaction.stream().map(n->n.getTrader().getCity()).distinct()
		.forEach(System.out::println);
		
		System.out.println("-------Question 10--------");
		transaction.stream()
		.filter(t->t.trader.getCity()=="Pune")
		.map(t->t.trader.getName())
		.sorted()
		.forEach(t->System.out.println("The traders in pune are:"+t));
	    
		System.out.println("-------Question11--------");
		transaction.stream()
		.map(t->t.trader.getName())
		.distinct()
		.sorted()
		.forEach(t->System.out.print(" "+t));
	    System.out.println();
		System.out.println("-------Question12--------");
	          	boolean answer= transaction.stream()
				.anyMatch(t->t.trader.getCity()=="Indore");
		    System.out.println(" Any traders based in Indore "+answer+"\n");
		    
		    
	      System.out.println("-------Question13--------");	
	      transaction.stream()
			.filter(t->t.trader.getCity()=="Delhi")
			.map(t->t.trader.getName())
			.sorted()
			.forEach(t->System.out.println("The traders in Delhi are:"+t));
	      
	      System.out.println("-------Question14--------");	
	      Transaction r=  transaction.stream().max(Comparator.comparing(Transaction::getValue)).get();
	      System.out.println(r);
	    
	      System.out.println("-------Question15--------");	
	      Transaction t=  transaction.stream().min(Comparator.comparing(Transaction::getValue)).get();
	      System.out.println(t);
	}

}
