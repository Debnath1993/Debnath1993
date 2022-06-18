package babai.practice;

class Dezire{
	void  add(int a,int b,int c) {
	System.out.println(a+b+c);
	}
	void add(float a,float b) {
		System.out.println(a+b);
	}
	void add(int a,int b) {
		System.out.println(a+b);
	}
}
class Verna{
	int id=34;
	String city="Pune";
	void fox(Verna vbj) {
		System.out.println(vbj);
		
	}
}
class Alto{
	int roll=21;
	String name="Sameer";
	float mobile=256.43f;
}
class Suzuki extends Alto{
	void play() {
		System.out.println("roll is: "+roll);
		System.out.println(name+" and his phone no. is "+mobile);
	}
	
}
public class Lord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Verna vbj=new Verna();
		System.out.println(vbj.id);
		System.out.println(vbj.city);
		vbj.fox(vbj);
		Dezire dbj=new Dezire();
		dbj.add(2.4f, 5.6f);
		dbj.add(34, 56);
		dbj.add(21, 77, 22);
		Suzuki sbj=new Suzuki();
		sbj.play();

	}

}
