package collection;

import java.util.ArrayList;

public class Array_list_e1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> languages = new ArrayList<>();
	    
	    languages.add("Java");
	    languages.add("C");
	    languages.add("Python");
	    languages.add("Php");
	    System.out.println("ArrayList: " + languages);
	    System.out.println("Access element by get method");
	    String str = languages.get(1);
	    System.out.print("Element at index 1: " + str);
	    System.out.println();
	    System.out.println("Change element by set method");
	    languages.set(2, "JavaScript");
	    System.out.println("Modified ArrayList: " + languages);
	    System.out.println();
	    System.out.println("Remove element by Remove method");
	    String str1 = languages.remove(2);
	    System.out.println("Updated ArrayList: " + languages);
	    System.out.println("Removed Element: " + str1);
	    System.out.println();
	    System.out.println("Accessing individual elements By using iterater:  ");

	    for (String lang : languages) {
	      System.out.print(lang);
	      System.out.print(", ");
	    }
	}

}
