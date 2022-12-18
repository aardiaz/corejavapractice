package javacollection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
	
	public static void main(String[] args) {
		
		//Set<String>  hset = new HashSet<>();
		//Set<String>  hset = new TreeSet<>();
		Set<String>  hset = new LinkedHashSet<>();
		
		hset.add("html");
		hset.add("java");
		hset.add("php");
		hset.add("java");
		hset.add("android");
		hset.add("html");
		hset.add("angular");
		
		for(String s : hset) {
			System.out.println(s);
		}
		
		
	}

}
