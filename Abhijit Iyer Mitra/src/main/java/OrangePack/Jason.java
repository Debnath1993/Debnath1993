package OrangePack;

class HistoryPack{
	final int id=30;
	String name="William";
	void pay() {
		System.out.println("Let's have a good day "+name);
		}
	static {
		System.out.println("Hey...its a static area");
	}
}
class LostWorld extends HistoryPack{
	void print() {
		System.out.println("This is child class");
	}
	void pay() {
		System.out.println("Base class overriden");
		System.out.println("the static id is"+id);
	}
	
}
public class Jason {

	public static void main(String[] args) {
	LostWorld lj=new LostWorld();
	lj.print();
	lj.pay();
	HistoryPack hpk=new HistoryPack();
	hpk.pay();

	}

}
