package javapracticles;

public class EncapsTest {
	public static void main(String args[]){
    	encapulation_EmpDetails obj = new encapulation_EmpDetails();
         obj.setEmpName("Ram");
         obj.setEmpAge(27);
         obj.setEmpno(112233);
         System.out.println("Employee Name: " + obj.getEmpName());
         System.out.println("Employee Empno: " + obj.getEmpno());
         System.out.println("Employee Age: " + obj.getEmpAge());
    }
}
