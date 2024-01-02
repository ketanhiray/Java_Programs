package javapracticles;

import java.util.Scanner;

public class swich3 {
	public static void main(String[] args) {
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your age :");
        int age =sc.nextInt();  
		switch (age)  
        {  
            case (16):            
                System.out.println("You are under 18, Not eligible for voting.");  
                break;  
            case (18):                
                System.out.println("You are eligible for vote.");  
                break;  
            case (65):                
                System.out.println("You are senior citizen.");  
                break;  
            default:  
                System.out.println("Please give the valid age.");  
                break;  
        }             
		
		
		
	}

}
