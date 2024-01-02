package collection;

import java.util.ArrayList;
import java.util.Collections;

public class Comparator_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Comparator_Student> al=new ArrayList<Comparator_Student>();  
		al.add(new Comparator_Student(101,"ketan",27));  
		al.add(new Comparator_Student(106,"sachin",29));  
		al.add(new Comparator_Student(105,"mudya",30));  
		  
		System.out.print("Sorting by Name:");  
		  
		Collections.sort(al,new Comparator_name_copm());  
		for(Comparator_Student st: al){  
		System.out.print(st.rollno+"  "+st.name+"  "+st.age);  
		System.out.print(",");
		}  
		  System.out.println();
		System.out.print("Sorting by age:");  
		  
		Collections.sort(al,new Comparator_agecomp());  
		for(Comparator_Student st: al){  
		System.out.print(st.rollno+"  "+st.name+"  "+st.age);  
		System.out.print(",");
		}  

	}

}
