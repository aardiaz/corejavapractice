package method;

public class Assignment {
	
	public static void main(String[] args) {
		
		int area = getArea(60, 30);
		  volume(area, 10);
	}
	
	static int getArea(int l, int b) {
		 
		 int a = l * b;
		 return a;
	 }
	 
	 
	static void volume(int area, int h) {
		 
		   int v = area * h;
		   System.out.println("Area = "+area);
		   System.out.println("Volume = "+v);
	 }

}
