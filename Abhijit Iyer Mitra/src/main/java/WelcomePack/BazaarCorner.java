package WelcomePack;

abstract class Hero{
	 void  print() {
		 System.out.println("Hello abstract");
	 }
	void m() {
		 System.out.println("Hello Agartala");
	 }
	int dk() {
		return 300;
	}
	String mg() {
		return "Chennai";
	}
}
class Mentor extends Hero{
	int id=dk();
	void pay() {
		System.out.println("There is the child class implimentation");
		print();
		//System.out.println("the string name is:"+name);
		m();
		
	}
}
class Student extends Mentor{
	String city=mg();
	void run() {
		System.out.println("the employee id is:"+id);
		System.out.println("the city name is: "+city);
		pay();
	}
}
public class BazaarCorner {

	public static void main(String[] args) {
	//System.out.println("This is main method area");
	//Mentor obj=new Mentor();
	//obj.pay();
		Student sd=new Student();
		sd.run();

	}

}
