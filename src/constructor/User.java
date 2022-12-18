package constructor;

public class User {
	
	//instance variables
	String userName;
	String password;
	
	//============= default constructor ===================
	User(){
		
		userName = "root";
		password = "1234";
	}
	
	//=============== parameterized constructor ===============
	
	User(String userName, String password){
		
		//calling constructor 
		//this();
		
		//calling instance variables
		this.userName = userName;
		this.password = password;
		
		//calling instance methods
		//this.print();
		/*
		 *  # 'this' keyword represents current object.
		 *  # we can call instance variables and instance 
		 *    methods using this
		 *    
		 *  # we can also call constructor using this keyword
		 *   but it should be first line.
		 */
	}
	
   User(String userName){
		
		this.userName = userName;
	}
	
	
	void print() {
		System.out.println("UserName = "+userName);
		System.out.println("Password = "+password);
	}
	
	public static void main(String[] args) {
		
		User u = new User("hari", "h123");
		u.print();
		
		//Object obj= new Object();
		/* =============== Object class(Root class)=================
		 * Class {@code Object} is the root of the class hierarchy.
		 * Every class has {@code Object} as a superclass. 
		 * All objects,including arrays, implement the methods of this class.
		 */
	}

}
