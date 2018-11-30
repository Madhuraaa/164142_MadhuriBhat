package AssignmentStrem;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class FruitAss1
{

public static void main(String[] args)
{
    List<Fruit> fruit = new ArrayList<>();
    
   
	
	fruit.add(new Fruit("apple", 60, 30, "red"));
	fruit.add(new Fruit("mango", 50, 100, "yellow"));
	fruit.add(new Fruit("pineapple", 70, 50, "yellow"));
	fruit.add(new Fruit("orange", 40, 30, "orange"));
	fruit.add(new Fruit("strawberry", 80, 100, "red"));
	
	
	
	
	System.out.println("\n List of fruits according calories\n");
	fruit.stream()
	.filter(f->f.getCalories()<100)
	.sorted(Comparator.comparing(Fruit::getCalories).reversed())
	.forEach(f->System.out.println(f.getName()+"=>"+f.getCalories()+"\n"));
	  
	System.out.println("Display color wise list of fruit names.");
     	          fruit.stream()
     	 		       .sorted(Comparator.comparing(Fruit::getColor).reversed())
     			       .forEach(f->System.out.println(f.getColor()+"=>"+f.getName()+"\n"));
	
//	
//	  List<String> list=   fruit.stream()
//	      .map(emp-> emp.getName().split(""))
//          .flatMap(array->Arrays.stream(array))
//          .map(str -> str.toUpperCase()) 
//          .filter(str -> !(str.equals(" ")))
//          .collect(Collectors.toList());
//	
//	System.out.println(list);
     	          
   System.out.println("Display only RED color fruits sorted as per their price in ascending order");	
    fruit.stream().filter(color->color.getColor()=="red")
                  .sorted(Comparator.comparing(Fruit::getPrice))  
                  .map(color->color.getName()+":"+color.getColor()+":"+color.getPrice())
                  .forEach(System.out::println);
	
	
  //   System.out.println(fruit.stream().filter(n->n.));
	
	
	
	
}}
	