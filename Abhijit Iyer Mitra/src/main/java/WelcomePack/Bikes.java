package WelcomePack;
 class Wion{
	static void influence() {
		System.out.println("Lets get influenced");
	}
}
 class Agartala{
	static void kokborok() {
		 System.out.println("Khobor paikha");
	 }
 }
abstract class Fantasy{
	abstract void carry();
		}
class Fox extends Fantasy{
	void carry() {
		System.out.println("Hello abstract implimentation");
	}
}
class Demand {
	int pnr=456;
	void run() {
		System.out.println("Hello base class sample");
	}
	void walk() {
		System.out.println(pnr);
	}
}
class Supply extends Demand{
	void pick() {
		System.out.println("Mining and construction, infrastructure,cargo & logistics");
	}
	void walk() {
		System.out.println("Base class method overriden");
	}
}
interface Vehicle{
	void dealer();
}
class Suzuki implements Vehicle{
	public void dealer() {
		int a=23;
		int b=34;
		int sum=a+b;
		int sub=b-a;
		System.out.println(sum);
		System.out.println(sub);
		System.out.println("this is authorized dealer");	
		}
}
public class Bikes {
	static void eat() {
		System.out.println("Lets execute the static class");
	}

	public static void main(String[] args) {
		
		int id=23;
		//String name="Chennai";
		//String Role="Manager";
		int fiction= id*100;
		System.out.println(fiction);
		Supply sbj=new Supply();
		sbj.pick();
		sbj.walk();
		Demand dbj=new Demand();
		dbj.run();
		dbj.walk();
		Fox fxj=new Fox();
		fxj.carry();
		eat();
		Wion.influence();
		Suzuki szk=new Suzuki();
		szk.dealer();
		Agartala.kokborok();

	}

}
