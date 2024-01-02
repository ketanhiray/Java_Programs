package input_output_stream;

import java.io.File;

public class File_methods {
	
	public static void main(String[] agrs) {
		
		
		File apath = new File("C:\\Users\\MyPC\\Downloads\\New folder (2)\\abc.txt"); 
		System.out.println("Path exists? "+ apath.exists()); 
		if (apath.exists()) { 
		System.out.println("Directory? "+ apath.isDirectory()); 
		 System.out.println("Simple Name: " + apath.getName());
		 System.out.println("Absolute Path: "+ apath.getAbsolutePath());

	}
	}
}
