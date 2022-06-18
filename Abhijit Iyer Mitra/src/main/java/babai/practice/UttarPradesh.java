package babai.practice;

class Kanpur{
	int id;
	String name;
	void show(int id,String name) {
		System.out.println("id is"+id);	
		System.out.println("name is"+name);
	}
}
class Pune extends Kanpur{
	void show(int id,String name) {
		System.out.println(id+" & name is "+name);
		
		
	}
	
}
public class UttarPradesh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pune pj=new Pune();
		pj.show(33, "Qasim");
		Kanpur kn=new Kanpur();
		kn.show(44, "Amrita");
		

	}

}
