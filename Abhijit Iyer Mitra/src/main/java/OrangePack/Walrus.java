package OrangePack;

class Test{
	int num;
	void fun() {
		for(num=30;num<50;num++) {
			System.out.println("the number is:"+num);
			}
	}
}
class TypeConversion{
	void pay() {
		double id=34.0045;
		long fg=(long)id;
		int hd=(int)id;
		System.out.println("the double is "+id+"long is"+fg+"int is"+hd);
		
	}
}
public class Walrus {
	static int i=30;
	static long b=i;
	static float v=b;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test obj=new Test();
		obj.fun();
		System.out.println("the int value is "+i+" long value "+b+" float is "+v);
		TypeConversion Tp=new TypeConversion();
		Tp.pay();

	}

}
