package array;

import java.util.Arrays;

public class ArraySortTest {
	
	public static void main(String[] args) {
//		
//		int data[] = {6,5,78,90,98,7,65,46,78,97,61,56,78,96,5};
//		
//		Arrays.sort(data);
//		
//		System.out.println(Arrays.toString(data));
//		
//		System.out.println("----------reverse order------------");
//		for(int i=data.length-1; i>=0; i--) {
//			System.out.print(data[i]+",");
//		}
//		
//		System.out.println();
		
		int values[] = new int[10];
		Arrays.fill(values, 40);
		System.out.println(Arrays.toString(values));
		
		Arrays.fill(values, 5, 10, 33);
		System.out.println(Arrays.toString(values));
		
		System.out.println(Arrays.toString(Arrays.copyOf(values, 4)));
		
	}

}
