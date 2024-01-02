package javapracticles;

public class encapsulation_BankAc2 {

	public static void main(String[] args) {
	 
		encapsulation_BankAc1 acc=new encapsulation_BankAc1();  
		    
		    acc.setAcc_no(070707070707L);  
		    acc.setName("Ketan hiray");  
		    acc.setEmail("ketan@gmail.com");  
		    acc.setAmount(700000f);  
		   
		    System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());  
		

	}

}
