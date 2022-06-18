

interface Apple{
	String  fruit="Apple is good for health";
	String color="Green";
	void diet();
	void sell();
}
abstract class Lunch implements Apple{

	@Override
	public void diet() {
		// TODO Auto-generated method stub
		System.out.println(fruit);
		System.out.println(color);
		
	}
	
}
class Zomato extends Lunch{

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		System.out.println("Hello sell me some fruits");
		
	}
	public void diet() {
		System.out.println("Hello healthy diet");
	}
}
class FoodChain extends Lunch{

	@Override
	public void diet() {
		// TODO Auto-generated method stub
		System.out.println("Foodchain is here");
		
	}

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		System.out.println("Lets sell some stuff");
		
	}
	
}
class Dinner implements Apple{

	@Override
	public void diet() {
		// TODO Auto-generated method stub
		System.out.println("Second subclass implementation");
		
	}

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		System.out.println("Second subclass content");
		System.out.println(fruit);
		
	}
	
}
public class MangoTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Lunch lunch=new Lunch();
		//lunch.diet();
		Dinner dn=new Dinner();
		dn.diet();
		dn.sell();
		Zomato zm=new Zomato();
		zm.sell();
		zm.diet();

	}

}
