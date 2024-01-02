package javapracticles;

import java.util.Scanner;

public class Result {

	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
	       System.out.println("Enter Your Marks:  ");
			
			int marks = sc.nextInt();

			 if(marks<50)
			    {  
			        System.out.println("Your Result fail");  
			    }  
			    else if(marks>=50 && marks<60){  
			        System.out.println("Your Got D grade");  
			    }  
			    else if(marks>=60 && marks<70){  
			        System.out.println("Your Got C grade");  
			    }  
			    else if(marks>=70 && marks<80){  
			        System.out.println("Your Got B grade");  
			    }  
			    else if(marks>=80 && marks<90){  
			        System.out.println("Your Got  A grade");  
			    }else if(marks>=90 && marks<100){  
			        System.out.println("Your Got  A+ grade");  
			    }else{  
			        System.out.println("Invalid!,Enter Valid input");  
			    } 
	}

}
