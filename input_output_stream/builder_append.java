package input_output_stream;

public class builder_append {
	public static void main(String args[]){  
		StringBuilder sb=new StringBuilder("Hello ");  
		sb.append("Java"); 
		System.out.println(sb); 
		sb.insert(1,"C++");
		System.out.println(sb); 
		sb.replace(1,3,"PHP");  
		System.out.println(sb);
		sb.delete(1,3);  
		System.out.println(sb);
		sb.reverse();  
		System.out.println(sb);
		}  

}
