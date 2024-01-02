package collection;

import java.util.Hashtable;
import java.util.Map;

public class HashTable_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
		  
		  hm.put(100,"ketan");  
		  hm.put(102,"sachin");  
		  hm.put(101,"vikas");  
		  hm.put(103,"Rahul");  
		  
		  for(Map.Entry m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
	
		  System.out.println("Remove value for key 102 :");
	       hm.remove(102);  
	       System.out.println("After remove: "+ hm);  
	       System.out.println();
	       System.out.println(" we specify the if and else statement as arguments of the method:");  
	       System.out.println(hm.getOrDefault(100, "Not Found"));  
	       System.out.println(hm.getOrDefault(105, "Not Found"));  
	       System.out.println("");
	       
	     
	       System.out.println("Inserts, as the specified pair is unique :");
	       hm.putIfAbsent(104,"makarand");  
	       System.out.println("Updated Map: "+hm);  
	       System.out.println();
	        System.out.println("Returns the current value, as the specified pair already exist :");
	       hm.putIfAbsent(106,"Vijay");  
	       System.out.println("Updated Map: "+hm); 
	}

}
