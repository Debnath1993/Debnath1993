package letsdoit;

//import org.eclipse.jdt.internal.compiler.ast.ThisReference;

class Mango{
	int pin=799006;
	static void run() {
		System.out.println("Hello mango!!");
	}
	void print() {
		System.out.println("Lets print Mango");
	}
	void write() {
		System.out.println("Mango writes a letter");
	}
	public Mango() {
		System.out.println("Hello parent constructor");
	}
}
class Apple extends Mango{
	
	String school="Bhavan's Tripura Vidyamandir";
	
	void print() {
		//System.out.println("please print Apple!!");
		System.out.println("super class variable accessed "+super.pin);
		super.write();
		System.out.println("current class instance variable accessed: "+this.school);
	}
	public Apple() {
		super();
		System.out.println("Hello child constructor");
	}
	static {
		System.out.println("this is static block");
	}
	
}
public class Indore {
    static void play() {
    	System.out.println("Hello static Indore");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	play();
	//Mango mango=new Mango();
	//mango.print();
	//Mango.run();
	Apple apple=new Apple();
	apple.print();

	}

}
