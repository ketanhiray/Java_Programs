package input_output_stream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;

public class File_Character_copy {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub 
		FileReader reader=null;
		FileWriter write=null;
		
		
		try {
			
		reader= new FileReader("C:\\Users\\MyPC\\Downloads\\New folder (2)\\abc.txt");	
		write=	new FileWriter("C:\\Users\\MyPC\\Downloads\\New folder (2)\\xyz.txt");
			
		int c;
		while((c=reader.read())!=-1) {
			
			write.write(c);
		}
		}finally {
			
			
			if(reader !=null){reader.close();}
			if(write !=null) {write.close();}
			
		}
		
	}

}
