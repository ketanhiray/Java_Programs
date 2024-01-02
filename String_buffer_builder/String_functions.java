package String_buffer_builder;


public class String_functions extends Class_A{

	public String_functions(String s) {
		super(s);
		
	}

	public static void main(String[] args) {
		Class_A a = new Class_A("Technocipher"); 
		Class_A a1 = new Class_A("java");
				Class_A a2 = new Class_A("waraje");
				 String x = "Pune"; 
				String y = "tchgno"; 
				String z = new String(" Technocipher "); //guess true or false without seeing output
				 System.out.println(x==z);
				 System.out.println(y==z);
				 System.out.println(x.equals(y)); 
				System.out.println(x==y); 
				System.out.println(x.equals(z));
				 System.out.println(a==a);
				 System.out.println(a==a1); 
				System.out.println(a1==a2); 
				System.out.println(a.equals(a2));
				System.out.println(a1.equals(y)); 
				}

	}


