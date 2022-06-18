package babai.practice;

public class Mango {
	String name;
	Product prod;
	
	Mango(String  name){
		this.name=name;		
		
	}
	void play() {
		System.out.println("This is Mango with a "+name);
		prod.print();
		
	}
	

}
