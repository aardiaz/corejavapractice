package objectwitharray;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ObjectWithArray {

	/*
	 * =================== Object With Array ===================
	 * 
	 * syntax :
	 * 
	 * class_name[] array_name = new class_name[size];
	 * 
	 * e.g.
	 * 
	 * 
	 * //create array of Student Student[] students = new Student[20];
	 * 
	 * Student s1 = new Student(); s1.id = 9988; ....... .....
	 * 
	 * students[0] = s1 ;
	 * 
	 * 
	 * //create array of Employee Employee[] employees = new Employee[50];
	 * 
	 * //create array of Book Book books[] = new Book[500];
	 * 
	 * 
	 */

	public static void main(String[] args) {

		// create array of 5 cars
		Car[] cars = getCars();

		// print array of object i.e cars
		printCar(cars);

	}

	// create array of car
	static Car[] getCars() {
		
		Car cars[] = new Car[5];
		
		
		
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < cars.length; i++) {

			Car c = new Car();

			System.out.println("Enter Color");
			c.setColor(sc.next());

			System.out.println("Enter Model");
			c.setModel(sc.next());

			System.out.println("Enter price");
			c.setPrice(sc.nextInt());

			System.out.println("Enter cc");
			c.setCc(sc.nextInt());

			cars[i] = c;
		}

		return cars;
	}

	// print cars
	static void printCar(Car[] cars) {

		System.out.println(Arrays.toString(cars));

	}
	
//	static void testCars() {
//		Car[] carArray = {new Car("red", 5000, 800000, "m20"), new Car("blue", 2000, 900000, "mx30"), new Car("black", 4500, 78000, "mp90")};
//	
//		System.out.println(Arrays.toString(carArray));
//		System.out.println("============");
//		
//	    Arrays.sort(carArray, new Comparator<Car>(){
//
//			@Override
//			public int compare(Car c1, Car c2) {
//				 
//				return  c1.getColor().compareTo(c2.getColor());
//			}
//	    	  
//	    });
//	    
//	    System.out.println(Arrays.toString(carArray));
//	
//	}

}
