package com.test.SDETTraining;
import java.util.ArrayList;
import java.util.List;
public class CountNamesStartingWithATest {
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
		int count = 0;
		for (String name : names) {
			if (name.startsWith("A")) {
				count++;
			}
		}
		System.out.println(count);
		
		//optimal way to count in one line using stream and lambda expression.
		
	}
	
	

}
