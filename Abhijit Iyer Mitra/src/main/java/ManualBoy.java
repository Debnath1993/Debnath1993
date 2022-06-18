
class Happy{
	private int id;
	private String name;
	
	Happy(int id,String name){
		this.id=id;
		this.name=name;
	}
	public void getValue() {
		System.out.println("This is action area");
		System.out.println("the candidate id is "+id+" & name is "+name);
	}
	
}
class Desk extends ManualBoy{
	void getValue() {
		int roll=450;
		String city="Pune";
		System.out.println("Hello city "+city+" with roll "+roll);
	}
	
}

public class ManualBoy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Happy hbj=new Happy(50,"Deepak Singh");
		//hbj.getValue();
		//Happy hbj1=new Happy(20,"Willaim Stark");
		//hbj1.getValue();
		Desk dk=new Desk();
		dk.getValue();

	}

}
