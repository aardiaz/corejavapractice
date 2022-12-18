package javacollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import inheritance.Employee;

public class ListTest {
	
	public static void main(String[] args) {
		
		
		 // List<String> list = new ArrayList<>();
		  List<String> list = new LinkedList<>();
		  
		  list.add("Nepal");
		  list.add("Hello");
		  list.add("China");
		  list.add("Korea");
		  list.add("USA");
		  
		  //list.remove("Hello");
		 // list.remove(2);
		  //list.clear();
		  
		  System.out.println(list.contains("Korea"));
		  
        for(String s : list) {
        	System.out.println(s);
        }
		
	}

}
