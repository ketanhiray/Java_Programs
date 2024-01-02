package collection;

import java.util.LinkedHashMap;

public class LinkedHashMap_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Creating a LinkedHashMap of even numbers");
        LinkedHashMap<String, Integer> evenNumbers = new LinkedHashMap<>();
        evenNumbers.put("Two", 2);
        evenNumbers.put("Four", 4);
        System.out.println("LinkedHashMap1: " + evenNumbers);
        System.out.println();
        System.out.println("Creating a LinkedHashMap from other LinkedHashMap");
        LinkedHashMap<String, Integer> numbers = new LinkedHashMap<>(evenNumbers);
        numbers.put("Three", 3);
        System.out.println("LinkedHashMap2: " + numbers);
        System.out.println();
        System.out.println("Using put If Absent()");
        evenNumbers.putIfAbsent("Six", 6);
        System.out.println("Updated LinkedHashMap(): " + evenNumbers);

        System.out.println();
        System.out.println("Creating LinkedHashMap of numbers");
        LinkedHashMap<String, Integer> numbers1 = new LinkedHashMap<>();
        numbers1.put("One", 1);

        System.out.println();
        System.out.println("Using putAll()");
        numbers1.putAll(evenNumbers);
        System.out.println("New LinkedHashMap: " + numbers1);
        
      
        System.out.println();
        System.out.println("remove method with single parameter:");
        int value = numbers.remove("Two");
        System.out.println("Removed value: " + value);

       
        System.out.println();
        System.out.println(" remove method with two parameters:");
        boolean result = numbers.remove("Three", 3);
        System.out.println("Is the entry Three removed? " + result);
	}

}
