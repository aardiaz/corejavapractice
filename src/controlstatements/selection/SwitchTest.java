package controlstatements.selection;

public class SwitchTest {
	/*
	 * syntax :
	 * 
	 * switch(variable){
	 * 
	 * case 1 : //statements break;
	 * 
	 * case 2 : //statements break;
	 * 
	 * ............... .................. default : //statements }
	 */

	public static void main(String[] args) {

		int day = 9000;

		switch (day) {

		case 1:
			System.out.println("Sunday");
			break;

		case 2:
			System.out.println("Monday");
			break;

		case 3:
			System.out.println("Tuesday");
			break;

		case 4:
			System.out.println("Wednesday");
			break;

		case 5:
			System.out.println("Thursday");
			break;

		case 6:
			System.out.println("Friday");
			break;

		case 7:
			System.out.println("Saturday");
			break;

		default: 
			System.out.println("invalid input");

		}
		
		/*
		 *  Q> calculate total salary as :
		 *  
		 *    post      basic Salary   bonus    Total Salary
		 *    ------    ------------   ------   ------------
		 *    MD         370000          23%       ?
		 *    CEO        350000          17.38%    ?
		 *    MANAGER    280000          8%        ?
		 *    HELPER     75000           12.89%    ?
		 *  
		 */

	}

}
