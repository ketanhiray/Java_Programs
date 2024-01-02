package collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class Priority_queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> numbers = new PriorityQueue<>();

        // offer elements to the Queue
        numbers.offer(7);
        numbers.offer(5);
        numbers.offer(8);
        numbers.offer(9);
        numbers.offer(4);
        System.out.println("Queue: " + numbers);

      
        System.out.println("Access elements of the Queue");
        int accessedNumber = numbers.peek();
        System.out.println("Accessed Element: " + accessedNumber);

     
        System.out.println("Remove elements from the Queues");
        int removedNumber = numbers.poll();
        System.out.println("Removed Element: " + removedNumber);

        System.out.println("Updated Queue: " + numbers);
		
		
	}

}
