package javapracticles;

public class Static_Nested2 {

	  static int data=500;  
	   static class Inner
	   {  
	       static void msg(){
		   System.out.println("data is "+data);
	   }  
	  }  
	 
	  public static void main(String args[])
	  {  
		  Static_Nested2.Inner.msg();
	  }  
}
