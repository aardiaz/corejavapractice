package aggregation;

public class Test {
	
	public static void main(String[] args) {
		
		Car c = new Car();
		c.setColor("Red");
		c.setPrice(98000000);
		c.setModel("ZtM900");
		
		Employee emp  = new Employee();
		emp.setId(6780);
		emp.setName("Karan Rai");
		emp.setSalary(700000);
		emp.setCompany("Google");
		emp.setCar(c);
		
		
		System.out.println("Id = "+emp.getId());
		System.out.println("Name = "+emp.getName());
		System.out.println("Company = "+emp.getCompany());
		System.out.println("======== car info =======");
		System.out.println("Color = "+emp.getCar().getColor());
		System.out.println("Model = "+emp.getCar().getModel());
		System.out.println("Price = "+emp.getCar().getPrice());
		
		
	}
	

}
