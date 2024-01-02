package collection;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Queue<Integer> numbers = new LinkedList<>();

		 
		 System.out.println(" offer elements to the Queue");
	       
	        numbers.offer(1);
	        numbers.offer(2);
	        numbers.offer(3);
	        System.out.println("Queue: " + numbers);

	       System.out.println();
	        System.out.println("Access elements of the Queue");
	        int accessedNumber = numbers.peek();
	        System.out.println("Accessed Element: " + accessedNumber);
	        System.out.println();
	      
	        System.out.println("Remove elements from the Queue");
	        int removedNumber = numbers.poll();
	        System.out.println("Removed Element: " + removedNumber);
	        System.out.println();
	        System.out.println("Updated Queue: " + numbers);
	        System.out.println();
		
		
	}

}
