

import java.util.*;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		float p= sc.nextFloat();
		float t= sc.nextFloat();
		float r= sc.nextFloat();
		float n= sc.nextFloat();
		
		System.out.println("principle="+p);
		System.out.println("Time="+t);
		System.out.println("rate="+r);
		System.out.println("number of times the interest is compounded"+n);
		
		System.out.println("Simple Interest for the given values is:");
		
		float SI=(p*t*r)/100;
		
		System.out.println(SI);
		
		float compoundinterest= (float) (p*(Math.pow((1 + r / 100), t))); ;
		
		System.out.println("compond interest is:"+compoundinterest);


	}

}
