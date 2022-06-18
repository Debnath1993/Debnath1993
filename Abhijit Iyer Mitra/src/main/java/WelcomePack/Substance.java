package WelcomePack;

class HomeWork{
	int id=35;
	String name="Sanjiv Sharma";
	String role="Java developer";
	int salary=30000;
	String city="Indore";
	void view() {
		System.out.println("Employee name is "+name+" from the city "+city+" & role is "+role);	
		}
}
public class Substance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HomeWork obj=new HomeWork();
		obj.view();

	}

}
