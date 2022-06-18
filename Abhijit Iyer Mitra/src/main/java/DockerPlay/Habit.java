package DockerPlay;

interface Family{
	String city="Indore";
	void print();
}
class Drama{
	void play() {
		System.out.println("hello user, please apply your logic.");
	}
}
class Saket implements Family{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Here comes the Family implimentations");
		System.out.println("My city name is:"+city);
	}
	
}
public class Habit {
	static String content="Hello admin...welcome to Main method.";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Activity zone");
		System.out.println(content);
		Drama drama=new Drama();
		drama.play();
		Saket saket=new Saket();
		saket.print();
	}

}
