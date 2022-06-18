package letsdoit;

class Calculation{       //void methods
	void addition() {
		int a=23;
		int b=34;
		int add=a+b;
		System.out.println("Addition:"+add);
	}
	void multiply() {
		int a=45;
		int b=56;
		int mul=a*b;
		System.out.println("Multiplication:"+mul);
	}
	void division() {
		int a=34;
		int b=2;
		int div=a/b;
		System.out.println("Division:"+div);
	}
	void  multiplication() {
	float x=3.4f;
	float z=2.6f;
	float res=x*z;
	System.out.println("result:"+res);
		}
	public int print(int a,int b,int c) { //function with return type
		return a*b*c;
		}
}

public class TestCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation cal=new Calculation();
		cal.addition();
		cal.division();
		cal.multiply();
		cal.multiplication();
		System.out.println(cal.print(7, 12, 14));

	}

}
