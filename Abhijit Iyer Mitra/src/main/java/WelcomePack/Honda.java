package WelcomePack;

public class Honda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JainAuto obj=new JainAuto();
		obj.dealer();
		Maruti mbj=new Maruti(24,"Chennai");
		mbj.publish();
		System.out.println("roll is: "+mbj.roll+"& city name is "+mbj.city);
		Maruti mbj2=new Maruti(35,"Pune");
		System.out.println("roll is: "+mbj2.roll+"& city name is "+mbj2.city);
		Maruti mbj3=new Maruti(56,"Indore");
		System.out.println("roll is: "+mbj3.roll+"& city name is "+mbj3.city);
		
		

	}

}
