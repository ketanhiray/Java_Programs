package array;

public class Min_Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int [] arr = new int [] {25, 11, 7, 75, 56,100};  
	         
	        int min = arr[0];  
	       
	        for (int i = 0; i < arr.length; i++) {  
	           
	           if(arr[i] <min)  
	               min = arr[i];  
	        }  
	        System.out.println("Minimum element present in given array: " + min);  
            System.out.println("");
          
            int max = arr[0];  
           
            for (int i = 0; i < arr.length; i++) {  
                 
               if(arr[i] > max)  
                   max = arr[i];  
            }  
            System.out.println("Maximum element present in given array: " + max);  
            
	}

}
