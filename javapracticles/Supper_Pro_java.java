package javapracticles;

public class Supper_Pro_java extends Super_Programmer{

	
	// overriding method
	  @Override
	  public void display(){
	    System.out.println("I am a java programmer");
	  }
	  
	  public void printMessage(){

		    // this calls overriding method
		    display();

		    // this calls overridden method
		    super.display();
		  }
}
