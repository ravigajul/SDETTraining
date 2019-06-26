package com.test.SDETTraining;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressions {
	
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		names.add("Ravi");
		names.add("Anju");
		names.add("Aditya");
		names.add("Agenda");
		names.add("Arjun");
		names.add("Shiri");
		names.add("Radhika");
		names.add("Ajay");
		System.out.println(names);
		long count1=names.stream().filter(name->name.startsWith("R")).count();
		System.out.println(count1);
		
		//using Stream.of instead of List
		long count2=Stream.of("Ravi","Anju","Agenda","Shiri","Radhika","Ajay").filter(name->name.startsWith("S")).count();
		System.out.println("# of names starting with S is/are " + count2);
		
		//limiting the filter by number two and printing the same.
		names.stream().filter(s->s.startsWith("A")).limit(2).forEach(s->System.out.println("Name starting with A " + s));
		
		
		//Printing names which end with A and print them in upper case
		Stream.of("Ravi","Anju","Aditya","Shiri","Radhika","Ajay").filter(name->name.endsWith("a")).forEach(name->
		{
			String uname=name.toUpperCase();
			System.out.println("Name with upper case " + uname);
		});
		
		
		//Printing names which end with A and print them in upper case using map
		Stream.of("Ravi","Anju","Aditya","Shiri","Radhika","Ajay").filter(name->name.endsWith("a"))
		.map(name->name.toUpperCase()).forEach(name->System.out.println(name));
			
					
	}
	
	

}
