package Exception_handaling;

public class nested_try {
	
	 public static void main(String args[])  
	    {  
	        // outer (main) try block  
	        try {  
	    
	            //inner try block 1   
	            try {  
	    
	                // inner try block 2  
	                try {  
	                    int arr[] = { 5, 8, 6, 4 };  
	  
	                    //printing the array element out of its bounds  
	                    System.out.println(arr[20]);  
	                }  
	    
	                // to handles ArithmeticException  
	                catch (ArithmeticException e) {  
	                    System.out.println("Arithmetic exception");  
	                    System.out.println(" inner try block 2");  
	                }  
	            }  
	    
	            // to handle ArithmeticException   
	            catch (ArithmeticException e) {  
	                System.out.println("Arithmetic exception");  
	                System.out.println("inner try block 1");  
	            }  
	        }  
	    
	        // to handle ArrayIndexOutOfBoundsException   
	        catch (ArrayIndexOutOfBoundsException e4) {  
	            System.out.print(e4);  
	            System.out.println(" outer (main) try block");  
	        }  
	        catch (Exception e5) {  
	            System.out.print("Exception");  
	            System.out.println(" handled in main try-block");  
	        }  
	    }  

}
