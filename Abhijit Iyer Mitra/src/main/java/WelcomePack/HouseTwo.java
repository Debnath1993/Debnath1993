package WelcomePack;

class DormantBase{ //Super keyword in java
	int a=25;
	String city="Bangalore";
	void run() {
		System.out.println("this is base class method");
	}
}
class Vitamin extends DormantBase{
	String name="Pune";
	String school="BTVM";
	Float salary=25000.34f;
	void walk() {
		System.out.println("the child class object is "+name+" & "+school+" & "+"salary");
		System.out.println("super class int variable is:"+super.a);
		System.out.println("super class String variable:"+super.city);
	}
}
public class HouseTwo {

	public static void main(String[] args) {
		Vitamin vbj=new Vitamin();
		vbj.walk();
		vbj.run();

	}

}
