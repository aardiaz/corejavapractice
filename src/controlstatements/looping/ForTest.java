package controlstatements.looping;

import java.util.Scanner;

public class ForTest {
	
	/*
	 *   for(initialization;condition; inc/dec){
	 *   
	 *       //statements
	 *   }
	 */
	
	public static void main(String[] args) {
		
		int start;
		int end;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter start value");
		start = sc.nextInt();
		
		System.out.println("Enter end value");
		end = sc.nextInt();
		
		for(int i=start; i<=end; i++) {
		       System.out.println(i);
		}
		
	}
}
