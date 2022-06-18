package DockerPlay;

interface Gambit{ //interface with no method
	int id=34;
	String name="William";
	float sal=2538.453f;
	}
interface Agartala{   //interface with  abstract method
	 void playtools();
		
}
class Anuj implements Gambit,Agartala{ // subclass implements multiple interfaces
	void play() {
	System.out.println("The corresponding id is:"+id);
	System.out.println("Name is:"+name+" & sal is:"+sal);
	
    }
	
	@Override
	public void playtools() { //subclass method overriding interface method
		// TODO Auto-generated method stub
		System.out.println("Hey there, Agartala");
	}
}
public class Lemon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anuj anuj=new Anuj();
		anuj.play();
		anuj.playtools();

	}

}
