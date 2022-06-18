
 class RegisterMix{
	 static int id=34;
	 static String name="Soumyadeep Debnath";
	 //int roll=700;
	static void fun() {
		System.out.println("lets make it a big deal");
		System.out.println("the private variables are: "+id+" name is "+name);
		
	}
}
class Boredom extends RegisterMix{
	void pay() {
		fun();
		System.out.println("Child class experiments");
		System.out.println("The Eclipse ide is truely a very dynamic development tool");
	}
	
}
public class RationShop {
	static void print() {
		System.out.println("lets have the static here");
	}

	public static void main(String[] args) {
		System.out.println("Lets start the day with some coding practice");
		print();
		RegisterMix rg=new RegisterMix();
		RegisterMix.fun();
		Boredom bd=new Boredom();
		bd.pay();
	}

}
