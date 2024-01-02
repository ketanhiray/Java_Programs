package javapracticles;

public class Greeting_massge {
	String greeting_msg="Hello java";
	String user_name="Ketan";
	
	String getEmailTxt(String emailMsg) 
	{
		String CompleteMsg= greeting_msg+"\n "+user_name+"\n "+emailMsg;
	    System.out.println(CompleteMsg);
	    return CompleteMsg;
	}
	
	String getSmsTxt(String smsMsg1) {
		String CompleteMsg = greeting_msg+"\n "+user_name+"\n "+smsMsg1;
		
		return CompleteMsg;
		
	}
	public static void main(String[] args) {
		String emaiMsg="Email :This is test email by Ketan";
		String smsMsg1=" SMS: This is java";
		System.out.println("*****Welcome  *****");
		
		Greeting_massge gm= new Greeting_massge();
		gm.getEmailTxt(emaiMsg);
		gm.getSmsTxt(smsMsg1);
		System.out.println("****Thank You*****");
		
	}
	
	

}
