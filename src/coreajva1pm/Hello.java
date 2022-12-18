package coreajva1pm;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Hello {
	
	/*
	 *  1> public    : access everywhere 
	 *  2> protected : access in class,same package, child class in another package
	 *  3> default(package private) : access in class and same package.
	 *  4> private              : access in class only.
	 */
	  //main+ctrl+space
	 public   static final void  main(String[] args) {
		 LocalDate dob = null;
		 
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		 
		 System.out.println("enter dob");
		// Scanner sc= new Scanner(System.in);
		// String dt = sc.next();
		 dob = LocalDate.parse("2012/09/12", dtf);
		//sysout+ctrl+space
		System.out.println("Hello"+dob);
	}
}

