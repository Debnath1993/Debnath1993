package OrangePack;

class ParentSpot{
	void print() {
		System.out.println("Lets go for a race");
		}
}
class ChildSpot extends ParentSpot{
	
	void play() {
		System.out.println("Child plays with a ball");
	}
	void sleep() {
		System.out.println("Lets sleep together");
	}
	
}
public class DiscoMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentSpot pj=new ParentSpot();
		pj.print();
		ParentSpot poj=new ChildSpot();
		poj.print();
		((ChildSpot) poj).play();
		((ChildSpot) poj).sleep();
		ChildSpot cp=new ChildSpot();
		cp.print();

	}

}
