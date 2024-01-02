package collection;

import java.util.Iterator;
import java.util.Vector;

public class Vector_e1 {

	public static void main(String[] args) {
		
		Vector<String> mammals= new Vector<>();

        mammals.add("Dog");
        mammals.add("Horse");

        mammals.add(2, "Cat");
        System.out.println("Vector: " + mammals);

        Vector<String> animals = new Vector<>();
        animals.add("Crocodile");

        animals.addAll(mammals);
        System.out.println("New Vector: " + animals);
        
        
        System.out.println("Index  of Elements: ");
        String element = animals.get(2);
        System.out.println("Element at index 2: " + element);
       System.out.println();
       
       System.out.println("Display Elements by using Iterator: ");
       Iterator<String> iterate = animals.iterator();
       System.out.print("Vector: ");
       while(iterate.hasNext()) {
           System.out.print(iterate.next());
           System.out.print(", ");
       }
       System.out.println();
       
       System.out.println("Removeing  Elements: ");
       String element1 = animals.remove(1);
       System.out.println("Removed Element: " + element1);
       System.out.println("New Vector: " + animals);

       System.out.print("size of vector: ");
      
       System.out.println(animals.size());

       
	}

	private static String size(Vector<String> animals) {
		// TODO Auto-generated method stub
		return null;
	}

}
