package datatypes;

public class WrapperTest {
	
	/*
	 * ============= Wrapper Class ===============
	 * 
	 *  primitive Type      Wrapper Class
	 *  ---------------    ---------------
	 *  byte					Byte
	 *  short					Short
	 *  int 					Integer
	 *  long					Long
	 *  char					Character
	 *  float					Float
	 *  double					Double
	 *  boolean 				Boolean
	 */
	
	public static void main(String[] args) {
		
		//'a' is int variable only
		int a = 400;
	  
		//'x' is int variable and object also
		Integer x = 500;
		
		//==Auto-boxing : change primitive types(variable) in to 
		//                 wrapper type(object)
		
		int p = 90000;
		Integer q = p;//auto-boxing
		 
		//=== Auto unboxing : change wrapper type into primitive type.
		
		Double m = 2342.233445;
		double n = m;  //auto un-boxing
		
		System.out.println(Integer.toBinaryString(6789));
		System.out.println(Integer.toOctalString(6789));
		System.out.println(Integer.toHexString(6789));
	}
}
