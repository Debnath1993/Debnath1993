package PracticeStack;

class BaseFix{
	static int value=340;
	int id=456;
	int roll;
	int pg;
	void run() {
		System.out.println("Here is the non-static variable:"+id);
	}
	
}
public class MangoStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BaseFix bf=new BaseFix(34,56);
		//bf.run();
		System.out.println("Base class static variable accessed: "+BaseFix.value);
		//bf.run();

	}

}
