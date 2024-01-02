package javapracticles;

import java.util.Scanner;

public class greterthanlessthan {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
	       System.out.println("Enter Number 1 :  ");
			
			int num1 = sc.nextInt();
			
           System.out.println("Enter Number 2 :  ");
			
			int num2 = sc.nextInt();
			
			
			if (num1 > num2) {
				  System.out.println(num1+" is greater than "+num2);
				}else {
					
					
					System.out.println(num2+" is greater than "+num1);
				}
					
		
		
		

	}

}
