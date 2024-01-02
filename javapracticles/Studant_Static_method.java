package javapracticles;

public class Studant_Static_method {

	int rollno;
    String name;
    static String college = "SP College";

static void change() 
{
college = "Modern College";
}

Studant_Static_method(int r, String n){
	
       rollno = r;
       name = n;
}

void display(){System.out.println(rollno+" "+name+" "+college);
}
}


