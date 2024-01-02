package collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deque_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> deque = new ArrayDeque<String>();  
		   deque.add("vikram");    
		   deque.add("ketan");     
		   deque.add("sachin");
		   
		   
		   System.out.println("Traversing elements: ");
		   for (String str : deque) {  
		   System.out.print(" "+str);  
		   }  
		   System.out.println();
		   deque.add("mukul");  
		    deque.offerFirst("jai");  
		    System.out.println("After offerFirst Traversal:");  
		    for(String s:deque){  
		        System.out.print("  "+s);  
		    }  
		    System.out.println();
	}

}
