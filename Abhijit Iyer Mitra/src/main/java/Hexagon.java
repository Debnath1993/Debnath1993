
class MixedBag{
	public int play(int a,int b) { //function declared with arguments
		if(a>b)
			return a;
		else
			return b;
		
	}
}
public class Hexagon {

	public static void main(String[] args) {
		MixedBag mg=new MixedBag();
		System.out.println(mg.play(45, 34)); //function called with object creation
		MixedBag mg2=new MixedBag();
		System.out.println(mg2.play(56, 123));
	

	}

}
