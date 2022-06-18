package PracticeStack;

class HouseSpot{
	int id=230;
	String name="Soumyadeep Debnath";
	final String address="Kumaritilla,Kunjaban";
	void print() {
		System.out.println("This is the admin details:");
		System.out.println("Admin name is: "+name+" belongs to id: "+id);
		}
	static void run() {
		System.out.println("This is static method content");
	}
}
class AgtChild extends HouseSpot {
	void pay() {
		String city="Chennai";
		System.out.println("child class variable "+city);
		   }
	void print() {
		System.out.println("Hey there!! base class method got overriden");
	    }
	
}
public class ChangePoint {
	
	static void fun() {
		int item=135;
		
		String Market="City Centre";
		System.out.println("This is static method area");
		System.out.println("The details are:"+item+" & "+Market);
		
		
	}

	public static void main(String[] args) {
		/*HouseSpot obj=new HouseSpot();
		obj.print(); */
		AgtChild abj=new AgtChild();
		abj.print();
		abj.pay();
		abj.run();
		fun();
		

	}

}
