package javacollection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionTest {
	
	public static void main(String[] args) {
		
		List<Integer>  list = Arrays.asList(76,8,9,76,57,896,57,86,57,86,57);
		
		Collections.sort(list);
		
		System.out.println(list);
		
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
		
		//Collections.fill(list, 20);
	 
		//System.out.println(list);
		
		Collections.reverse(list);
		
	}

}
