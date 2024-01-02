package javapracticles;

public class AndOperater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=10,b=20,c=30;
     
        //10>20 && 20>30
        System.out.println(a>b && b>c);// false
        
      //10<20 && 20>30
        System.out.println(a<b && b>c);//false
        
      //10<20 && 20<30
        System.out.println(a<b && b<c);// true
        
      //10<20 & 20>30
		System.out.println(a<b & b>c);//false
		
		//10>20 || 20>30
		System.out.println(a>b || b>c);//false
		
		//10>20 || 20>30
		System.out.println(a>b || b>c);// false
		
		//10>20 || 20<30
		System.out.println(a>b || b<c);//true
	
	}

}
