
class Test<T>{ //generic class declared
	T obj;      // object of type T declared
	
	Test(T obj){  //Constructor declared
		this.obj=obj;
	}
	public T getobj() {   //function of type T declared with a return type
		return this.obj;
	}
}
public class Disco {

	public static void main(String[] args) {
		System.out.println("Hello Disco begins here");
		
		Test<Integer> iobj=new Test<Integer>(300); //object of integer type created
		System.out.println(iobj.getobj());
		
		Test<String> sobj=new Test<String>("Hello Generics"); //object of string type
		System.out.println(sobj.getobj());

	}

}
