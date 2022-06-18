package WelcomePack;

class Kolkata{
	public int add(int a,int b) {
		return (a+b);
		
	}
	public float add(float a,float b,float c) {
		return (a+b+c);
	}
	
}
public class HomeTown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Kolkata obj=new Kolkata();
 System.out.println(obj.add(23, 034));
 System.out.println(obj.add(2.4f, 3.6f, 5.7f));
 
	}

}
