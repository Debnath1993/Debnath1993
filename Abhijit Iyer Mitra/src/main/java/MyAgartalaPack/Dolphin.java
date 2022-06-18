package MyAgartalaPack;

public class Dolphin {
int id=45;
String name="Darwin";
String city="Nagpur";
float salary=50000.34f;

public IndianOcean ion; //Reference type datatype as a dependent class

public void print() {
	System.out.println("Hello "+name);
	System.out.println("id: "+id+" belongs to city: "+city);
	System.out.println("the salary wrt to id number "+id+" is: "+salary);
   }
}
