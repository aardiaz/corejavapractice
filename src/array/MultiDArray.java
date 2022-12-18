package array;

import java.util.Scanner;

public class MultiDArray {
	/*
	 * ============== MultiDArray==============
	 * 
	 * # use to represent data in rows and columns or table form.
	 * 
	 * syntax :
	 *    data_type  array_name[][] = new data_type[row][col];
	 */

	   public static void main(String[] args) {
		
		   int mat[][] = new int[2][2];
		   
		    //write data in mulitD array
//		   mat[0][0] = 30;
//		   mat[0][1] = 40;
//		   mat[1][0] = 10;
//		   mat[1][1] = 90;
		   
		   Scanner sc = new Scanner(System.in);
		   
		     for(int i=0; i<2; i++) {
		    	 
		    	 for(int j=0; j<2; j++) {
		    		 
		    		 System.out.println("Enter value for mat");
		    		 mat[i][j] = sc.nextInt();
		    	 }
		     }
		   
		   //read data from array
		   
		   for(int i=0; i<2; i++) {
			   
			   for(int j=0; j<2; j++) {
				   
				   System.out.print(mat[i][j]+" ");
			   }
			   
			   System.out.println();
		   }
		  
		   
		   
		   
		   
		   
		   
	}
}


