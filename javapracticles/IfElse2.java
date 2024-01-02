package javapracticles;

import java.util.Scanner;

public class IfElse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
       System.out.println("Enter Number:  ");
		
		int number = sc.nextInt();
		
		if(number%2==0){  
	        System.out.println("Is Even Number");  
	    }else{  
	        System.out.println(" Is Odd Number");  
	    }  

	}

}
