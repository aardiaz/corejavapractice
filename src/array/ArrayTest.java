package array;

import java.util.Scanner;

public class ArrayTest {
	
	public static void main(String[] args) {
		
		int age[] = new int[5];
		/*  0    1   2   3   4
		 * [20][30][22][18][17]
		 * <-- age -->
		 */
		
		//write value in array
		
		Scanner sc= new Scanner(System.in);
		
		for(int i=0; i<age.length; i++) {
			
			System.out.println("Enter your age");
			age[i] = sc.nextInt();
		}
		
//		age[2]  = 22;
//		age[0]  = 20;
//		age[1] = 30;
//		age[3] = 18;
//		age[4] = 17;
		
		//read data from array
		for(int x : age) {
			
		       System.out.println(x);
		}
		
		
		
	}

}
