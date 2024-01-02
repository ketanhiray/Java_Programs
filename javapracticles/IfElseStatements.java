package javapracticles;

import java.util.Scanner;

public class IfElseStatements {

	public static void main(String[] args) {
		
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter Your age:  ");
		
		int age = sc.nextInt();
	
		 if (age <= 18) {
			
			System.out.println("Your Age is less than 18 yr");
			
		}else if(age >= 18 || age <=30 ) {
			
			System.out.println("Your age between 18 yr  to 30 yr");
		}else {
			
			System.out.println("Your age is more than 30 yr");
		}
		

	}

}
