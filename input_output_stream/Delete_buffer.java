package input_output_stream;

public class Delete_buffer {

	public static void main(String[] args)
    {
        StringBuffer s = new StringBuffer("Technocipherjavaprograms");
        s.delete(0, 5);
        System.out.println(s); 
        s.deleteCharAt(7);
        System.out.println(s); 
    }
}
