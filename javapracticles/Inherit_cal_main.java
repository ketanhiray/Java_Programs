package javapracticles;

public class Inherit_cal_main extends Inherit_calculation {

	
		   public void multiplication(int x, int y) {
		      z = x * y;
		      System.out.println("The product of the given numbers: "+z);
		   }
			
		   public static void main(String args[]) {
		      int a = 20, b = 10;
		      Inherit_cal_main d = new Inherit_cal_main();
		      Inherit_calculation k= new Inherit_cal_main();
		      System.out.println("Inherit_calculation k= new Inherit_cal_main();");
		      k.addition(a, b);
		      k.Subtraction(a, b);
		    //  k.multiplication(a, b);
		      System.out.println("Inherit_cal_main d = new Inherit_cal_main();");
		      d.addition(a, b);
		      d.Subtraction(a, b);
		      d.multiplication(a, b);
		   }
	
}
