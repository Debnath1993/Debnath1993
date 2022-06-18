package WelcomePack;

abstract class Shape{  
	int pi=314;//abstract class
	
	abstract void area();  //abstract method
}
class Circle extends Shape{
	void area() {
		int a=23;
		int area=a*50*pi;
		System.out.println("Area of circle:"+area);
	}
	
}
class Square extends Shape{
	void area() {
		int b=45;
		int area=40*b*pi;
		System.out.println("Area of square:"+area);
		
	}
}

public class Abstraction {

	public static void main(String[] args) {
	
		//obj.run();
		Circle cbj=new Circle();
		cbj.area();
		Square sbj=new Square();
		sbj.area();
		

	}

}
