package letsdoit;

class Visual{
	int id;
	String name;
	String city;
	float mobile;
	
	public Visual(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	void point() {
		System.out.println("Hello!! "+name+" you are from "+city+" right?");
	}
	public Visual(int id, String name, String city, float mobile) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.mobile = mobile;
	}
	public Visual() {
		System.out.println("Hello default constructor");
	}
	void print() {
		System.out.println("Default constructor zone");
	}
	
	void play() {
		System.out.println("the employee is "+name+" from "+city+" with id "+id+" and contact number "+mobile);
	}
}
public class Manual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Visual visual=new Visual(30,"Rahul","Kanpur",9845673f);
    visual.play();
    Visual vs=new Visual();
    vs.print();
    Visual vl=new Visual("Samuel","Pune");
    vl.point();
    
    
	}

}
