package PracticeStack;

class HomeFive{
	String name="Rahul Dravid";
	int roll=300;
	static int salary=35000;
	final String city="Chennai";
	
	void print() {
		System.out.println("roll is: "+roll);
		System.out.println("name is: "+name);
		System.out.println("employee salary is: "+salary);
		
		
	}
	static void run() {  //static method accessing only static variable
		System.out.println("static method call is:"+salary);
	}
}
class BikeStand extends HomeFive{
	
	void print() {
		System.out.println("Child class method overriding parent class method");
		System.out.println("the city name is:"+city);
	}
	void say() {
		System.out.println("the super class reference is:"+super.city);
	}
	
}
public class MangoPackThree {
	static int a=34;    //static class variables declared.
	static int b=23;
    static int sum=a+b;
	static int mul=a*b;

	public static void main(String[] args) {  //static main method
		int c=56;
		int d=100;
		int sum1=c+d;
		int mul1=c*d;
		System.out.println("Main method operations here");
		System.out.println("the driver class output are: "+sum+" & "+mul);
		System.out.println("the local variables are: "+sum1+" & "+mul1);
		HomeFive hfv=new HomeFive();
		hfv.print();
		HomeFive.run(); //calling static variable directly through class name
		BikeStand bsj=new BikeStand();
		bsj.print();
		bsj.say();
	}

}
