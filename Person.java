package com.collect.sr;

public class Person {
	
	int height;
	float weight;
	String name;
	Person(int height,float weight,String name){
		this.height=height;
		this.weight=weight;
		this.name=name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void display(){
		System.out.println("height:"+getHeight()+"\t"+"weight:"+getWeight()+"\t"+"name:"+getName());
		
	}
   
}
