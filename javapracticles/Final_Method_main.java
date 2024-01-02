package javapracticles;

public class Final_Method_main extends Final_method_eg
{
		
		  public final void display() 
		  {
		    System.out.println("The final method is overridden.");
		  }

		  public static void main(String[] args) {
			  Final_Method_main obj = new Final_Method_main();
		    obj.display();
		  }
		}
	

