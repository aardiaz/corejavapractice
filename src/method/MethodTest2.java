package method;

public class MethodTest2 {

	public static void main(String[] args) {

		//sum();
		//printTable(45);
		
		int x = getSumOf1to100();
		System.out.println("Total sum = "+x);
		
		int gv = findGreatestValue(400, 34543);
		System.out.println("Greatest Value = "+gv);
		
	}

	// 1. no return type with no arguments
	static void sum() {

		int a = 500;
		int b = 1200;
		
		int c = a + b;
		System.out.println("Total = " + c);
	}
	
	//2. no return type with arguments
	static void printTable(int n) {
		
		  for(int i=1; i<=10; i++) {
			  System.out.println(n+" x "+i+" = "+(n*i));
		  }
	}
	
	//3. return type with no arguments
	static int  getSumOf1to100() {
		
		int s = 0;
		
		for(int i=1; i<=100; i++) {
			s = s + i;
		}
		
		return s;
	}
    	
	
   //4. return type with arguments
	static int findGreatestValue(int a, int b) {
		
		  if(a > b) {
			  return a;
		  }
			  
		  return b;
	}

}



