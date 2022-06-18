package WelcomePack;

import java.util.*;
//import java.util.Scanner;

public class DolphinOne {

	public static void main(String[] args) {
		
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Arvind");
		ll.add("Sameer");
		ll.add("Yaspal");
		ll.add("Lalit");
		ll.add("Anuj");
		System.out.println("Before:"+ll);
		ll.remove("Lalit");
		System.out.println("Lalit");
		LinkedList<Integer> lobj=new LinkedList<Integer>();
		lobj.add(34);
		lobj.add(45);
		lobj.add(23);
		lobj.add(90);
		System.out.println("Elements are:"+lobj);
		try {
		lobj.removeFirst();
		System.out.println("After:"+lobj);
	
		}
		catch(Exception e) {
			System.out.println("UNEXPECTED ERROR");
		}
	
		
	
		
		
		}

}
