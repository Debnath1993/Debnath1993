
class LazySpot{
	int name=300; //instance variable
	static String city="Pune"; //class variable 
	void play() {
		String employee="Santa"; //local variable
		System.out.println(name);
		System.out.println(employee);
		System.out.println(name);
	}
	static void print() {
	System.out.println("static variable is:"+city);
	}
}
public class LazyJob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello its Lazy guy here");
		LazySpot lz=new LazySpot();
		lz.play();
		LazySpot.print();

	}

}
