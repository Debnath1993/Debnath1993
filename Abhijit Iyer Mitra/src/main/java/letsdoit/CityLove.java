package letsdoit;

class Agartala{
	public int scale(int a,int b) {
		return a*b;
		
	}
	public int size(int a,int b) {
		return a+b;
	}
	public int surface(int a,int b) {
		return a/b;
	}
}
public class CityLove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Agartala agt=new Agartala();
System.out.println(agt.scale(23, 34));
System.out.println(agt.size(21, 50));
System.out.println(agt.surface(20, 10));
	}

}
