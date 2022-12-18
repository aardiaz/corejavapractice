package javacollection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {
	
	public static void main(String[] args) {
		
		//Map<String, Integer>  hmap = new HashMap<>();
		//Map<String, Integer>  hmap = new TreeMap<>();
		Map<String, Integer>  hmap = new LinkedHashMap<>();
		
		hmap.put("suman", 30);
		hmap.put("rama", 22);
		hmap.put("aardi", 20);
		hmap.put("hari", 29);
		
		for(String key : hmap.keySet()) {
			System.out.println(key+" = "+hmap.get(key));
		}
		
		Map<String, List<String>>  tsmap = new HashMap<>();
		
		tsmap.put("Hari sir",  Arrays.asList(new String[] {"aaa","bbb","rrr","ddd","kkk"}));
		tsmap.put("Pawan sir", Arrays.asList(new String[] {"vvv","mmmm","ppp","www","lplp","ggg"}));
		
		for(String key : tsmap.keySet()) {
			System.out.println(key+" = "+ tsmap.get(key));
		}
		
		
	}

}
