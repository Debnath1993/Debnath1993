package PracticeStack;

class HumpBack{
	void run() {
		String name="Whale";
		System.out.println(name);
	}
	static void fun() {
		System.out.println("Lets print the static method statement");
	}
}
class BasePrint{
	static class ChildPrint{ //static inner class
		void mix() {
			System.out.println("lets have the inner class");
		}
	}

	
	}
class BaseSize{
	class InkPack{
		void paint() {
			String color="Yellow & Green";
			System.out.println("Lets print the colors of inner class here");
			System.out.println("The colors are:"+color);
		}
	}
}

public class NextBox {
	public static void main(String args[]) {
		System.out.println("Lets print the main method");	
		HumpBack hb=new HumpBack();
		hb.run();
		HumpBack.fun();
		BasePrint bp=new BasePrint(); //accessing static inner class
		BasePrint.ChildPrint obj=new BasePrint.ChildPrint();
		obj.mix();
		BaseSize outer=new BaseSize(); //accessing the inner class
		BaseSize.InkPack inner=outer.new InkPack();
		inner.paint();
	}
		
}




