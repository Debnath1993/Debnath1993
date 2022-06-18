package PracticeStack;

class Hitachi{
	int id=45;
	static String city="Chennai";
	void fix() {
		int id=30;
		System.out.println("Hello base class");	
		System.out.println("base class local variable is"+id);
		}
}
class Samsung extends Hitachi{
	String city="Pune";
	
	Samsung(String city){
		this.city="Chennai";
	}
	void print() {
		System.out.println("the id inside child class is:"+id);
		System.out.println("the class variable of base class is:"+city);
		
	}
	void fix() {
		System.out.println("Base class fix method overriden");
		System.out.println("Child class variable is:"+city);
	}
	
	
}
public class TotalBox {

	public static void main(String[] args) {
		Samsung smg=new Samsung("Chennai");
		smg.fix();
		smg.print();
		Hitachi hij=new Hitachi();
		hij.fix();
		

	}

}
