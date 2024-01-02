package input_output_stream;

public class String_buffer2 {
	public static void main(String[] args)
    {
        StringBuffer s = new StringBuffer("Technocipher");
        s.insert(5, "for");
        System.out.println(s); 
  
        s.insert(0, 5);
        System.out.println(s); 
  
        s.insert(3, true);
        System.out.println(s); 
  
        s.insert(5, 41.35d);
        System.out.println(s); 
  
        s.insert(8, 41.35f);
        System.out.println(s); 
  
        char geeks_arr[] = { 'k', 'e', 't', 'a', 'n' };
  
        // insert character array at offset 9
        s.insert(2, geeks_arr);
        System.out.println(s); 
    }

}
