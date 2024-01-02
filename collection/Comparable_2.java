package collection;

import java.util.ArrayList;
import java.util.Collections;

public class Comparable_2 {

	public static void main(String args[]){  
		ArrayList<Camparable_Interface_ex> al=new ArrayList<Camparable_Interface_ex>();  
		al.add(new Camparable_Interface_ex(101,"ketan",23));  
		al.add(new Camparable_Interface_ex(106,"sachin",27));  
		al.add(new Camparable_Interface_ex(105,"mudasar",21));  
		  
		Collections.sort(al);  
		for(Camparable_Interface_ex st:al){  
		System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  
 }

}