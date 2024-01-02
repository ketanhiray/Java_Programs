package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMap_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
		   map.put(1,"ketan");  //Put elements in Map  
		   map.put(2,"sachin");    
		   map.put(3,"mudasar");   
		   map.put(4,"rahul");   
		   map.put(4,"Grapes"); //trying duplicate key 
		       
		   System.out.println("Iterating Hashmap...");  
		   for(Map.Entry m : map.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());    
		   }  
		  
	}

}
