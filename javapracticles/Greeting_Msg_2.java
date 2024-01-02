package javapracticles;

public class Greeting_Msg_2 {

	public static void main(String[] args) {
		String emailMsg= "EMAIL: This is test by ketan ";
		String smsMsg="SMS : This sms by ketan";
		
		System.out.println("*****BOI******");
		Greeting_Msg_1 gm= new Greeting_Msg_1("Hi", "BOI");
		gm.getEmailTxt(emailMsg);
		gm.getSmsTxt(smsMsg);
		
		System.out.println("*****BOM******");
		Greeting_Msg_1 gm1= new Greeting_Msg_1("Hi", "BOM");
		gm1.getEmailTxt(emailMsg);
		gm1.getSmsTxt(smsMsg);
		
		System.out.println("*****Axis******");
		Greeting_Msg_1 gm2= new Greeting_Msg_1("Hi", "Axis");
		gm2.getEmailTxt(emailMsg);
		gm2.getSmsTxt(smsMsg);
		
	}

}
