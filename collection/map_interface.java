package collection;

import java.util.HashMap;
import java.util.Map;

public class map_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map=new HashMap<Integer,String>();  
		  map.put(100,"ketan");  
		  map.put(101,"Vijay");  
		  map.put(102,"Rahul");  
		 
		  System.out.println("Elements can traverse in any order :");
		  for(Map.Entry m:map.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
		  
		
		  System.out.println("Returns a Set view of the mappings contained in this map   :");
	      map.entrySet()  
	      //Returns a sequential Stream with this collection as its source  
	      .stream()  
	      //Sorted according to the provided Comparator  
	      .sorted(Map.Entry.comparingByKey())  
	      //Performs an action for each element of this stream  
	      .forEach(System.out::println);  
	}

}
