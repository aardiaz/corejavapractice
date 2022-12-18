package array;

public class ArrayWithMethod {
	
	/*
	 * ============== Array With Method ===============
	 * 
	 *  1> array as arguments:
	 *  
	 *      void sum(int a[]){
	 *      
	 *         
	 *      }
	 *      
	 *  2> array as return type :
	 *  	
	 *      int[] getValue(){
	 *      
	 *      //array = 400,5,666,77,2232,234445,5656,767676,6767;
	 *        return array;
	 *      }
	 */
	
	public static void main(String[] args) {
		
		int data[] = {6,54,63,52,44,5,68,25,30,4,56,78,9,6,8,75,4};
		add(data);
		
		findSmallestValue(data);
		//create array for 10 cities
	}
	
   static void findSmallestValue(int[] data) {
		 
	   int sv = data[0];
	   for(int x : data) {
		   if(sv > x)
		     sv = x;
	   }
	   System.out.println("Smallest value = "+sv);
		
	}

	//array as arguments
	static void add(int values[]) {
		
		int s = 0;
		
		for(int x : values) {
			s = s + x;
		}
		
		System.out.println("Total sum = "+s);
	}
	
     
}
