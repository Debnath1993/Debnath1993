package WelcomePack;

class BaseGlass{
	
	int id=24;
	String name="Rahul Dravid";
	void run() {
		System.out.println("the parent class properties are id: "+id+" & "+"name is: "+name);
	}
	void walk() {
		int salary=60000;
		System.out.println("the salary is:"+salary);
	}
}
class Penguin extends BaseGlass{ //child class
    int jobid;
	int adminid;
	static int adhaar=3400;  //static variable
	static { //static block
	System.out.println("lets print the static value:"+adhaar);
	}
	void fix() {
		System.out.println("Child class starts here");
		System.out.println("jobid is: "+jobid+" and adminid is: "+adminid);
		//System.out.println("Child class admin id is:"+adminid);
		super.walk(); //super keyword
		super.run();
		System.out.println("base class properties are:"+super.id+" and "+super.name);
	}
	Penguin(int adminid,int jobid){  //Constructor
		this.adminid=adminid;    //this keyword
		this.jobid=jobid;
		
	}
}
public class DolphinLogs {
	static int a=mg();   //static variable declared
	
	static int mg() {   //static method
		System.out.println("This is static method");
		return 100;
		
	}

	public static void main(String[] args) {
		System.out.println("Inside driver class method");
		Penguin pg=new Penguin(345,67);   //object initialization
		pg.fix();
		Penguin pg1=new Penguin(200,675);
		pg1.fix();
		System.out.println("value of static variable is "+a);
		}

}
