package collection;
import java.util.TreeMap;
public class TreeMap_Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<String, Integer> evenNumbers = new TreeMap<>();

      
		System.out.println("Using put():");
        evenNumbers.put("Two", 2);
        evenNumbers.put("Four", 4);
        evenNumbers.put("Three", 3);

       
        System.out.println("Using putIfAbsent():");
        evenNumbers.putIfAbsent("Six", 6);
        System.out.println("TreeMap of even numbers: " + evenNumbers);

        
        System.out.println("Creating TreeMap of numbers:");
        TreeMap<String, Integer> numbers = new TreeMap<>();
        numbers.put("One", 1);

        
        System.out.println(" Using putAll():");
        numbers.putAll(evenNumbers);
        System.out.println("TreeMap of numbers: " + numbers);
        

      
        System.out.println("Using entrySet():");
        System.out.println("Key/Value mappings: " + numbers.entrySet());


        System.out.println("Using keySet():");
        System.out.println("Keys: " + numbers.keySet());

        
        System.out.println("Using values():");
        System.out.println("Values: " + numbers.values());
        
 
        System.out.println(" Using get():");
        int value1 = numbers.get("Three");
        System.out.println("Using get(): " + value1);

    

	}

}
