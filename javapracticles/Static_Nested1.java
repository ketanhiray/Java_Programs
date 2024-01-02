package javapracticles;

public class Static_Nested1 {
	
	static int data=100;  
	static class Inner{  
	void msg()
	  {
		System.out.println("data is "+data);
		}  
	  }  
	  public static void main(String args[]){  
		  
		  Static_Nested1.Inner k=new Static_Nested1.Inner();  
	      k.msg();  
	  }  

}
