package WelcomePack;

class House{
	protected int id=40; 
	void run() {
		 int a=23;
		 int b=34;
		int product=a*b;
		int sum=a+b;
		System.out.println("the sum is:"+sum);
		System.out.println("product is:"+product);
		System.out.println("lets print the pvt variable "+id);
		
		
	}
}
class Matrix extends House{
	
	void runlazy() {
		System.out.println("Child class method area");
		System.out.println(id);
		super.run();
	}
	
}
public class SamplePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Matrix  mxj=new Matrix();
		mxj.runlazy();

	}

}
