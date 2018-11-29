package com.collect.sr;

import java.util.ArrayList;
import java.util.List;

class Contain<T>{
	private T value;
	void add(T value){
		this.value=value;
		System.out.println(value);
	}
	public T get(){
		return value;
	}




public static void main(String[] args) {
//    Contain<Integer> c=new  Contain<Integer>();
//    c.add(1);
//    c.add(12);
//    c.add(34);
//  //  c.remove();
//    
//    Contain<String>  s=new Contain<String>();
//    s.add("madhuri");
//    
    Contain<Emp> cc=new Contain<>();
    cc.add(new Emp("Madhu",2,13));
    cc.add(new Emp("Madhu1",4,14));
    cc.add(new Emp("Madhu2",6,15));
    System.out.println();
    System.out.println(cc.get());
    
    
}
}


