package objectwithmethod;

public class Test {

	public static void main(String[] args) {

		Test t = new Test();

		Customer x = t.getCustomerData();
		t.printCustomer(x);
		
	}

	// object as arguments
	void printCustomer(Customer c) {

		System.out.println("Id = " + c.getId());
		System.out.println("Name = " + c.getName());
		System.out.println("City = " + c.getCity());
		System.out.println("Age = " + c.getAge());
		System.out.println("Phone = " + c.getPhone());
	}

	// object as return type
	Customer getCustomerData() {

		Customer c1 = new Customer();

		c1.setId(9988);
		c1.setAge(40);
		c1.setName("Prabin Shahi");
		c1.setCity("Kathmandu");
		c1.setPhone("9876546776");
		return c1;
	}
	
	
}
