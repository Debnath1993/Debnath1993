package WelcomePack;

class Ocean{
	int id;
	String name;
	
	 Ocean(int roll,String city){
		this.id=roll;
		this.name=city;
		}
	void run() {
		System.out.println("this is base class method");
	}
}
public class River {

	public static void main(String[] args) {
		Ocean obj=new Ocean(23,"Chennai");
		obj.run();
		System.out.println("the id is:"+obj.id+"& name is:"+obj.name);
		Ocean obj2=new Ocean(12,"Kolkata");
		System.out.println("the id is:"+obj2.id+"& name is:"+obj2.name);

	}

}
