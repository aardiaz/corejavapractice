package controlstatements.selection;

public class NestedTest {
	
	/*
	 *   syntax :
	 *   
	 *     if(condition-1){
	 *     
	 *            if(condition-2){
	 *            
	 *                 .................
	 *                 ...................
	 *                 .......................
	 *            
	 *            }else{
	 *            
	 *            }
	 *            
	 *     }else{
	 *     
	 *     }
	 */
	
	public static void main(String[] args) {
		
		String citizen = "indian";
		int age = 40;
		
		   if(citizen.equals("nepali")) {
			   
					   if(age >= 18) {
						   System.out.println("You can vote");
					   }else {
						   System.out.println("you are under age");
					   }
					   
		   }else {
			  System.out.println("invalid citizenship"); 
		   }
		   
		   
		   
		   
	    
		
	}

}




