package WelcomePack;

public class Maruti {
	int roll;
	String city;
	
	Maruti(int roll,String city){
		this.roll=roll;
		this.city=city;
		
	}
	
	 void publish() {
		int id=456;
		System.out.println("the static method is here");
		System.out.println("the id of the static method is:"+id);
		
	}
	static {
		System.out.println("This is Maruti class Static block");
		String name="Rahul";
		System.out.println("Name inside static block is"+name);
	}

}
