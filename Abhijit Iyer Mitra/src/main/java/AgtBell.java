interface Garment{
	void pay();
	void wife();
}
class Husband implements Garment{
	public void pay() {
		String value="Hello interface implementation";
		System.out.println(value);
		
	}
	public void wife() {
		String wife_name="Sheetal";
		System.out.println(wife_name);
	}
}
class Hemant{
	static int roll=345;
  void mix() {
	  System.out.println(roll);	  
  }
}
class Basic extends Hemant{
	void print() {
		mix();
		System.out.println("Let's try some scenarios");
		
	}
	static void say() {
		System.out.println("Lest print static method");
	}
}
class Outer{
	static class Inner{ //static inner class
		  void run() {
			System.out.println("Here comes the inner class");
		}
	}
}
public class AgtBell {

	public static void main(String[] args) {
		/*Hemant hmt=new Hemant();
		hmt.mix();
		Basic bj=new Basic();
		bj.print();
		Basic.say();
		Outer.Inner iobj=new Outer.Inner();
	    iobj.run();*/
		Husband hb=new Husband();
		hb.pay();
		hb.wife();
		}

}
