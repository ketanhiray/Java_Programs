package javapracticles;

public class Greeting_Msg_1 {

	String greeting_msg="Hello java";
	String user_name="Ketan";
	
	Greeting_Msg_1(String gMsg,String uName)
	{
		greeting_msg=gMsg;
		user_name=uName;
	}
	
	String getEmailTxt(String emailMsg) {
		String completeMsg= greeting_msg +" "+ user_name + " "+ emailMsg;
		System.out.println(completeMsg);
		return completeMsg;
		
	}
	String getSmsTxt(String smsMsg) {
		String completeMsg= greeting_msg +" "+ user_name + " "+ smsMsg;
		System.out.println(completeMsg);
		return completeMsg;
		
	}
	
}
