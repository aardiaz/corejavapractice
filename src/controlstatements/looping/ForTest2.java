package controlstatements.looping;

public class ForTest2 {
	
	public static void main(String[] args) {
		
		int esum = 0;
		int osum = 0;
		
		
		for(int i=1; i<=100; i++) {
			if(i%2 ==0) {
		      //System.out.println(i);
			  esum = esum + i;
			}else {
				osum = osum + i;
			}
		}
		
		System.out.println("Sum of even nos = "+esum);
		System.out.println("Sum of odd nos = "+osum);
		System.out.println("=================");
		System.out.println("Total = "+(esum + osum));
	}
	
   
}
