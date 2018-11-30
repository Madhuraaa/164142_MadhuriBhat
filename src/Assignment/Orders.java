package Assignment;

class Orders{
	public static void main(String[] args){
		Shopping shop;
		shop=(item-> {
	     if(item<10000){
	    	 System.out.println("invalid");
	     }else 
	     {
	    	 System.out.println("Order  updated");
	     }
	     
	});
		shop.ordering(11000);
}

}




interface Shopping
{
	void ordering(int item);
}