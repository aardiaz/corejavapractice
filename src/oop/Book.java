package oop;

public class Book {

	// properties
	String name;
	int price;
	String author;
	int page;

	// methods
	void printBook() {
		System.out.println("Name = " + name);
		System.out.println("Price = " + price);
		System.out.println("Author = " + author);
		System.out.println("pages = " + page);
		System.out.println("================");
	}

	public static void main(String[] args) {
		
		Book b = new Book();
		
		b.name = "Math";
		
		b.page = 5000;
		b.price = 2500;
		b.author = "R.K Singh";
		
		b.printBook();
		
		/*
		 *   1> Car
		 *   2> Dog
		 *   3> Employee
		 *   4> Bike
		 *   5> Student
		 *   6> Mobile
		 *   7> Laptop
		 */
		
		
	}
	
}
