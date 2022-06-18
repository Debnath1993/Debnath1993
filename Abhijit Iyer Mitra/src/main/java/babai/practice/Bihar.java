package babai.practice;

class Patna{
	String name="Manish outer class";
	void print() {
		System.out.println(name);
	}
	static class Orissa{
		int roll=45;
		void play() {
			System.out.println("Welcome to Odisha");
		}
	}
}
public class Bihar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patna bj=new Patna();
		bj.print();
		Patna.Orissa ob=new Patna.Orissa();
		ob.play();

	}

}
