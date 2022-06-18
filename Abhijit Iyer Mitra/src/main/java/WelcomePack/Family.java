package WelcomePack;

class Father{
	String name="Sunil";
	int salary=30000;
	void run() {
		System.out.println("fathers name is:"+name);
		System.out.println("father salary is:"+salary);
	}
}
class Son extends Father{
	int id=23;
	String city="Kolkata";
	int roll=300;
	void walk() {
		System.out.println("the properties of son are:"+id+"&"+city+"&"+roll);
	}
	
}
public class Family {

	public static void main(String[] args) {
		Son obj=new Son();
		obj.walk();
		obj.run();
		

	}

}
