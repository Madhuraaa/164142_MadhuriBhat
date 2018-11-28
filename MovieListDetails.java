package com.collect.sr;

import java.util.ArrayList;
import java.util.Collections;

public class MovieListDetails {
	public static void main(String[] args){
		ArrayList<MovieDetails> arr= new ArrayList<>();
		MovieDetails m1=new MovieDetails("Van", "Hrithik", "Action");
		MovieDetails m6=new MovieDetails("Van1", "Hrithik", "Action");
		MovieDetails m2=new MovieDetails("Stri", "Amar", "Thrilling");
		MovieDetails m3=new MovieDetails("Raj", "Amir", "Suspense");
		MovieDetails m4=new MovieDetails("Raj1", "Amir", "Suspense");
		MovieDetails m5=new MovieDetails("Stri", "Amar", "Thrilling");
		arr.add(m1);
		arr.add(m2);
		arr.add(m3);
		arr.add(m4);
		arr.add(m5);
		arr.add(m6);

		
		Collections.sort(arr);
		for(MovieDetails mm:arr){
			System.out.println(mm);
		}
}
}