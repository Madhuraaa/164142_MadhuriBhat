package Assignment;

public class Operations {
	public static void main(String[] args) {
		
	Arithmetic	addition=(a,b)-> a+b;
	System.out.println("Addition = " + addition.operation(5, 6));
    
	Arithmetic subtraction=(a,b)->a-b;
	System.out.println("Subtraction="+subtraction.operation(7, 8));
	
	Arithmetic multiplication=(a,b)->a*b;
	System.out.println("Multiplication="+multiplication.operation(7, 8));
	
	Arithmetic division=(a,b)->a/b;
	System.out.println("Subtraction="+division.operation(64, 8));
		
	}

}

interface Arithmetic{
	int operation(int a,int b);
}
