package PracticeStack;

import java.util.Scanner;

class Nomad{
	int id;
	static int  roll=200;
	protected int city=56;
	protected int val=44;
	private int market=100;
	static int JioFiber=Bill();  //static variable declared
	static int Bill() {       //static method accessing static variable & returning value
	System.out.println("Monthly bill is:");		
		return 579;
		
	}
	void run() {
		System.out.println("Base class private value is:"+market);
		System.out.println("JioFiber monthly bill is:"+JioFiber);
		System.out.println("{{Loop starts here:}}");
		System.out.println("Enter id please");
		
		Scanner sc=new Scanner(System.in);  //Scanner class object
		int id=sc.nextInt();
		if(id==300) {
			System.out.println("equal stuff");
		}
		else if(id<300) {
			System.out.println("lesser stuff");
		}
		else if(id>300) {
			System.out.println("larger stuff");
		}
		else {
			System.out.println("Invalid input");
		}
	}
}
class Bike extends Nomad{
	void print() {
		System.out.println("normal value is:"+id);
		System.out.println("static value is:"+roll);
		System.out.println("private value changed protected is:"+city);
		System.out.println("protected value is:"+val);
		
	}
}
public class Home {

	public static void main(String[] args) {
		
		System.out.println("Say hello to all devs");
		//Bike boj=new Bike();
		//boj.print();
		//System.out.println("Base class space:");
		Nomad nd=new Nomad();
		nd.run();
		//System.out.println("the static variable is printed: "+Nomad.roll);
		

	}

}
