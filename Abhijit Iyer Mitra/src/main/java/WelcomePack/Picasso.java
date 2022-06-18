package WelcomePack;

interface Home{
	int pi=23;
	int id=45;
	abstract void run();  //100% abstraction
	
	
}
class Sayani implements Home{
	public void run() {
		int a=100;
		int value=a+pi+id;
		System.out.println("value is :"+value);
	}
}
public class Picasso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sayani obj=new Sayani();
		obj.run();

	}

}
