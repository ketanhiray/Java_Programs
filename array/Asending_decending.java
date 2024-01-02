package array;

public class Asending_decending {

	public static void main(String[] args) 
	{
		
		 int [] arr = new int [] {50, 22, 88, 70, 1};     
	        int temp = 0;    
	       
	        System.out.println("Elements of original array: ");   
	        
	        for (int i = 0; i < arr.length; i++) {  
	        	
	            System.out.print(arr[i] + " ");    
	        }    
	 
	        //Sort the array in ascending order    
	        for (int i = 0; i < arr.length; i++)
	           {     
	            for (int j = i+1; j < arr.length; j++) 
	            {     
	               if(arr[i] > arr[j]) 
	               {    
	                   temp = arr[i];    
	                   arr[i] = arr[j];    
	                   arr[j] = temp;    
	               }     
               }
	        }
	        System.out.println();    
	        //Displaying elements of array after sorting    
	        System.out.println("Ascending order: ");    
	        for (int i = 0; i < arr.length; i++) {     
	            System.out.print(arr[i] + " ");    
	        }   
	        
	        for (int i = 0; i < arr.length; i++) {     
	            for (int j = i+1; j < arr.length; j++) {     
	               if(arr[i] < arr[j]) {    
	                   temp = arr[i];    
	                   arr[i] = arr[j];    
	                   arr[j] = temp;    
	               }     
	            }     
	        }    
	            
	        System.out.println();    
	            
	        //Displaying elements of array after sorting    
	        System.out.println("Descending order: ");    
	        for (int i = 0; i < arr.length; i++) {     
	            System.out.print(arr[i] + " ");    
	        }    
     }
}
