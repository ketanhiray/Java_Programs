package javapracticles;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
	       System.out.println("Enter Year:  ");
			
			int year = sc.nextInt();
		
		    if(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0)){  
		        System.out.println(" IT's LEAP YEAR");  
		    }  
		    else{  
		        System.out.println(" IT'S COMMON YEAR");  
		    } 
		
	}

}
