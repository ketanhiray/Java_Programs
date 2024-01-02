package collection;

import java.util.Comparator;

public class Comparator_agecomp implements Comparator<Comparator_Student>{

	public int compare(Comparator_Student s1,Comparator_Student s2){  
		if(s1.age==s2.age)  
		return 0;  
		else if(s1.age>s2.age)  
		return 1;  
		else  
		return -1;  
		}  
}
