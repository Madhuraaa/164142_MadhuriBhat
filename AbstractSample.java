package Assignment;

abstract class Sample1 {
	abstract void  test1();
	//If any class has any of its method abstract then we must declare entire class abstract
    abstract void test2();
}

abstract class Sample2 extends Sample1
{
	public void test1()
	{
		System.out.println("Implemented in Sample1");
	}
	//void test2()
	//When we extend an abstract class,
	 //we must either override all the abstract methods in sub class or declare subclass as abstract.
}

  abstract class Sample3 
{     //Abstract class cannot be private.
	// Abstract class cannot be final.
	abstract void test3();
	}

 abstract class Sample4
 {
	
	 void test5(){
		// You can declare a class abstract without having any abstract method.
	 }
 }

class AbstractSample{
	public static void main(String[] args){
		//Sample1 sample=new Sample1();
		//Abstract class cannot be instantiated.
		
	}
}