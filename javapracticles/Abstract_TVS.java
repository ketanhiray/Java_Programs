package javapracticles;

public class Abstract_TVS extends Abstract_bike{

	void run(){
		System.out.println("Running safely");
		}  
	
	public static void main(String args[])
	{  
		Abstract_bike obj = new Abstract_TVS();  
	 obj.run(); 
	}
}
