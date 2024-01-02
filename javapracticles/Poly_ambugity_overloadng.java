package javapracticles;

public class Poly_ambugity_overloadng {

	static int add(int a,int b)
	{
		return a+b;
		
	}
	static double add(int a,int b)
	{
		return a+b;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ambiguity
		System.out.println(Poly_ambugity_overloadng.add(55,66));

	}

}
