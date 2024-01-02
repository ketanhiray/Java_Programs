package javapracticles;

import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
	       System.out.println("Enter Your Keyword :  ");
	       char ch=sc.next().charAt(0);   
		    switch(ch)  
		    {  
		        case 'a':   
		            System.out.println("IT's Vowel");  
		            break;  
		        case 'e':   
		            System.out.println("IT's Vowel");  
		            break;  
		        case 'i':   
		            System.out.println("IT's Vowel");  
		            break;  
		        case 'o':   
		            System.out.println("IT's Vowel");  
		            break;  
		        case 'u':   
		            System.out.println("IT's Vowel");  
		            break;  
		        case 'A':   
		            System.out.println("IT's Vowel");  
		            break;  
		        case 'E':   
		            System.out.println("IT's Vowel");  
		            break;  
		        case 'I':   
		            System.out.println("IT's Vowel");  
		            break;  
		        case 'O':   
		            System.out.println("IT's Vowel");  
		            break;  
		        case 'U':   
		            System.out.println("IT's Vowel");  
		            break;  
		        default:   
		            System.out.println("IT's Consonant");  
		    }  
	}

}
