package array;

public class old_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int [] arr = new int [] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};  
		  
	        System.out.println("Elements of given array present on even position: ");  
	        
	        for (int i = 1; i < arr.length; i = i+2) {  
	            System.out.print(" "+arr[i]);  
	        }  
	        System.out.println("");
	        System.out.println("Elements of given array present on odd position: ");  
	        //Loop through the array by incrementing value of i by 2  
	        for (int i = 0; i < arr.length; i = i+2) {  
	            System.out.print(" "+arr[i]);  
	        }  
	}

}
