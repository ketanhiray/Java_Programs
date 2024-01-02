package input_output_stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Write_data {

	public static void main(String[] args) {
		
		 try { 
			String path = "C:\\Users\\MyPC\\Downloads\\New folder (2)\\abc.txt"; 
			FileOutputStream fos = new FileOutputStream(path); 
			String s ="i am ketan hiray"; 
			byte b[] = s.getBytes();
			 fos.write(b); 
			System.out.println( "successfully written"); 
			fos.close(); 
			} catch (IOException e) { 
			e.printStackTrace();
			}
	}

}
