package abstraction;

public class Test {
	
	public static void main(String[] args) {
		
		CentralBank b = new NCCBank();
		
		b.getBankName();
		b.getInterestRate();
		
		
		UserService  us = new UserServiceImpl();
		
		us.addUser();  
		us.deleteUser();
		us.print();

		UserService.add();
		
//		CommonService  cs = new UserServiceImpl();
//		 cs.print();
		
	}

}
