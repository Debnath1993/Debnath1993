package WelcomePack;

	 
	
	
	
	
	

public class Hello {
	static {
		 int id=345;
		 System.out.println("the user id is:"+id);
	 }
	void run() {
		 System.out.println("this is base class method");
	 }

	public static void main(String[] args) {
		System.out.println("inside main method body");
		Hello obj=new Hello();
		obj.run();
		
		
		
		
		

	}

}
