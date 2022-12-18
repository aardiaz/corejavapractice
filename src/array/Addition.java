package array;

public class Addition {
	
	public static void main(String[] args) {
		
		int mat1[][] = {{22,44,55},{99,44,55},{20,90,88}};
		int mat2[][] = {{40,30,10},{66,77,11},{12,13,14}};
		
		int mat3[][] = new int[3][3];
		
		//addition
		
		for(int row=0; row<3; row++) {
			
			   for(int col=0; col<3; col++) {
				   
				   mat3[row][col] = mat1[row][col] + mat2[row][col];
				   System.out.print(mat3[row][col]+" ");
			   }
			   System.out.println();
		}
	}

}
