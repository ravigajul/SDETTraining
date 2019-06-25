package com.test.SDETTraining;

import java.util.ArrayList;
import java.util.List;

public class StreamFilter {
	
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		names.add("Ravi");
		names.add("Ajay");
		names.add("Agenda");
		names.add("Arjun");
		names.add("Shiri");
		names.add("Radhika");
		names.add("Anju");
		System.out.println(names);
		long count=names.stream().filter(name->name.startsWith("A")).count();
		System.out.println(count);
	}
	
	

}
