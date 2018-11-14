
public class Amstrong {
  public static void main(String[] args)
  {   int value=153;
	  int temp=value;
      int mod,res=0;
	  
	  while(value>0)
	  {
		  mod =value%10;
		 value=value/10;
		 res=res+(mod*mod*mod);
		 
	  }
	  if(temp==res)
	  {
		  System.out.println("Amstrong number");}
		  else
		  { System.out.println("Not an Amstrong number");  
		
	  }
	  
  }
}
