package javapracticles;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
	       System.out.println("Enter Number:  ");
			
			int num = sc.nextInt();
			
			if(num>0)
			    {  
			    System.out.println("Your Enter Number is  POSITIVE");  
			    }else if(num<0){  
			    System.out.println("Your Enter Number is NEGATIVE");  
			    }else{  
			    System.out.println("Your Enter Number is ZERO");  
			   }  
	}

}
