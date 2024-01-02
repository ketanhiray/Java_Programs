package collection;

 class Camparable_Interface_ex implements Comparable<Camparable_Interface_ex>{

	 int rollno;  
	 String name;  
	 int age;  
	 Camparable_Interface_ex(int rollno,String name,int age){  
	 this.rollno=rollno;  
	 this.name=name;  
	 this.age= age;  
	 }
	@Override
	public int compareTo(Camparable_Interface_ex ci) {
		// TODO Auto-generated method stub
		if(age==ci.age)  
			return 0;  
			else if(age>ci.age)  
			return 1;  
			else  
			return -1;  
		
	}

}
