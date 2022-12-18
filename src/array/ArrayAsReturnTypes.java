package array;

import java.util.Arrays;

public class ArrayAsReturnTypes {
	
	public static void main(String[] args) {
		
		 int[]  values = get10intValues();
		 System.out.println(Arrays.toString(values));
	}
	
	//array as return type
	static int[] get10intValues() {
		
		int array[] = {87,6,54,6,78,97,65,46,7,8};
		
		return array;
	}
	
	
	 
	
	

}
