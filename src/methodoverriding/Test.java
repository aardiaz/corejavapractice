package methodoverriding;

public class Test {
	
	public static void main(String[] args) {
		
		//static or early binding of object
		NabilBank  nb = new NabilBank();
		
		nb.getBankName();
		nb.getInterestRate();
		
		//up-casting
		CentralBank b = new PrabhuBank();
		
		Test t = new Test();
		t.printBankInfo(b);
		
	}
	
      //late or dynamic binding of object
	   //also known as runtime polymorphism
	void printBankInfo(CentralBank bweljfwelkfjlkewf) {
		
		bweljfwelkfjlkewf.getBankName();
		bweljfwelkfjlkewf.getInterestRate();
	}
	
}
