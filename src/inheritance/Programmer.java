package inheritance;

public class Programmer extends Employee{
	
	String progLang;
	String project;
	int bonus;
	
	void print() {
		
		 super.print();
		 
		System.out.println("Prog.Language = "+progLang);
		System.out.println("Project = "+project);
		System.out.println("Bonus = "+bonus);
	}
	
	public static void main(String[] args) {
		
		Programmer p = new Programmer();
		p.id = 88899;
		p.name = "Suman";
		p.company = "google";
		p.salary = 800000;
		p.bonus = 35000;
		p.progLang = "Java";
		p.project = "Health System";
		p.city = "Ktm";
		
		p.print();
	}
	
}
