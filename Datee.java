package com.collect.sr;

public class Datee {
	
	private int dd;
	private int mm;
	private int yyyy;
	
	public Datee(int dd, int mm, int yyyy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yyyy = yyyy;
	}
	public int getDd() {
		return dd;
	}
	public int getMm() {
		return mm;
	}
	public int getYyyy() {
		return yyyy;
	}
	
	@Override
	public String toString() {
		
		return "MyDate [dd=" + dd + ", mm=" + mm + ", yyyy=" + yyyy + "]";
	}
	
}
