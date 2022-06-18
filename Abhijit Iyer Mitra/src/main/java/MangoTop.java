class MyBike{
	int id=345;
	void run() {
		System.out.println(id);
	}
	
}
class MyScooter{
	static class Honda{  //static inner class
		void play() {
			System.out.println("The model of the scooter is Activa 6g");
		}
	}
}
public class MangoTop {

	public static void main(String[] args) {
		System.out.println("Lets have some static class practice");
		MyBike obj=new MyBike();
		obj.run();
		MyScooter.Honda cbj=new MyScooter.Honda();
		cbj.play();
		

	
}
	}

