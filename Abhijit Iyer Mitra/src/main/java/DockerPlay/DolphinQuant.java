package DockerPlay;
interface Magic{
	void say();
	void tell();
	void speak();
}
class TypeDetails implements Magic{
	static String  city="My friend is in Himachal";
	void funny() {
		String con="In between statement";
	    System.out.println(con);
	}
	@Override
	public void say() {
		// TODO Auto-generated method stub
		System.out.println("Magic says hello");
	}
	@Override
	public void tell() {
		// TODO Auto-generated method stub
		System.out.println("Magic tells a joke");
		
	}
	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("Magic speaks three languages");
		
	}
}
class Maruti extends TypeDetails{
	void wheels() {
		System.out.println("Cheap and robust");
		funny();
	}
}
class Honda extends TypeDetails{
	void capacity() {
		System.out.println("Best two wheeler company");
		funny();
	}
}
public class DolphinQuant {
static String name="I love Agartala";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maruti mj=new Maruti();
		mj.wheels();
		Honda hd=new Honda();
		hd.capacity();
		TypeDetails td=new TypeDetails();
		td.tell();
		td.speak();
		td.say();

	}

}
