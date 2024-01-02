package input_output_stream;
import java.io.FileInputStream;
import java.io.IOException;

public class Read_data {

	public static void main(String[] args) {
		
		try { 
			
			 String path = "C:\\Users\\MyPC\\Downloads\\New folder (2)\\abc.txt"; 
			 FileInputStream fis = new FileInputStream(path); 
			int i=0; while((i=fis.read())!=-1)
			{ char c =(char) i;
			 System.out.print(c);
			 } 
			fis.close();
			 } catch (IOException e) { 
			e.printStackTrace();
			 }
		} } 


	


