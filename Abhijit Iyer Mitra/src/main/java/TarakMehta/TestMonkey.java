package TarakMehta;

class DiscoMagic{
	int boy;
	String city;
	
	DiscoMagic(int boy,String city){
		this.boy=boy;
		this.city=city;
		}
	public void husky() {
		System.out.println("lets eat sphegatti");
		System.out.println("boy id:"+boy+" belongs to city "+city);
		
	}
}
interface WashingMachine{
	void rinse();
	void soak();
}
abstract class Doppler{
	 abstract void pomzilla();
	 
	}
class Willow implements WashingMachine{
	int id=300;
	String name="Emanuel James";
	double dollar=23.45;
	void play() {
		System.out.println("the name of the candidate is:"+name);
		System.out.println("the id is:"+id);
		System.out.println("the cost is $"+dollar);
	}
	public void rinse() {
		System.out.println("Lets unite for coding.");
	}
	public void soak() {
		System.out.println("Hello hanky panky...lets soak");
	}
}
 class Darwin extends Doppler{
	 static {
		 int value=45;
		 System.out.println("the static block contains"+value );
	 }
  public void pomzilla() {
	  System.out.println("Lets invest in DogeCoin");
  }
}
public class TestMonkey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Willow wbj=new Willow();
		wbj.play();
		wbj.rinse();
		wbj.soak();
		Darwin dw=new Darwin();
		dw.pomzilla();
		DiscoMagic dm=new DiscoMagic(23,"Wilsons");
		dm.husky();

	}

}
