package javapracticles;

 abstract class Abstract_Bank_main extends Abstract_Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Abstract_Bank b;  
		b=new Abstract_BOI();  
		System.out.println("Rate of Interest is BOI Bank: "+b.getRateOfInterest()+" %");    
		b=new Abstract_Axis();  
		System.out.println("Rate of Interest is Axis Bank: "+b.getRateOfInterest()+" %");   
		b=new Abstract_SBI();  
		System.out.println("Rate of Interest is SBI Bank:"+b.getRateOfInterest()+" %");   
		
	}

}
