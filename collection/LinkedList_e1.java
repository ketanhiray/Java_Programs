package collection;

import java.util.LinkedList;

public class LinkedList_e1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> names = new LinkedList<>();

	    // Add elements to LinkedList
		names.add("sachin");
		names.add("rahul");
		names.add("mudasar");
	    System.out.println("LinkedList: " + names);
		
	    names.add(1, "ketan");
	    System.out.println("Updated LinkedList: " + names);
	    String str = names.get(1);
	    System.out.print("Element at index 1: " + str);
	 
	    System.out.println();
        System.out.println("change elements at index 3"); 
	    names.set(3, "prashat");
	    System.out.println("Updated LinkedList: " + names);
	 
	    System.out.println();
        System.out.println("remove elements from index 1"); 
	    String str1 = names.remove(1);
	    System.out.println("Removed Element: " + str);
	    System.out.println("Updated LinkedList: " + names);
	    
	    
	
	    System.out.println();
        System.out.println("access the first element"); 
	    String str2 = names.peek();
	    System.out.println("Accessed Element: " + str2);

	    System.out.println();
        System.out.println("access and remove the first element"); 
	   	String str3 = names.poll();
	    System.out.println("Removed Element: " + str3);
	    System.out.println("LinkedList after poll(): " + names);
	    
	    System.out.println();
        System.out.println("add element at the end"); 
	    names.offer("Swift");
	    System.out.println("LinkedList after offer(): " + names);
	    
	}

}
