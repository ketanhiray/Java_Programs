package javapracticles;

public class encapulation_EmpDetails {
	
	    private int empno;
	    private String empName;
	    private int empAge;

	    //Getter and Setter methods
	    public int getEmpno(){
	        return empno;
	    }

	    public String getEmpName(){
	        return empName;
	    }

	    public int getEmpAge(){
	        return empAge;
	    }

	    public void setEmpAge(int newValue){
	        empAge = newValue;
	    }

	    public void setEmpName(String newValue){
	        empName = newValue;
	    }

	    public void setEmpno(int newValue){
	    	empno = newValue;
	    }
	}
	

