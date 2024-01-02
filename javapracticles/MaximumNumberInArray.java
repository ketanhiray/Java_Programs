package javapracticles;

public class MaximumNumberInArray {

	public static void main(String[] args) {
		
		
		
		int matrix[][]= {{2,4,5},{3,4,7},{1,2,9}};
		int min= matrix[0][0];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(matrix [i][j] <min) {
					min=matrix[i][j];
					
				}
			}
		}
		System.out.println(min);

	}

}
