package VeggiePack;
import java.util.*;

public class PracticeSpot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> obj=new PriorityQueue<>(); //PriorityQueue & ArrayDeque
		obj.offer(23);
		obj.offer(6);
		obj.offer(34);
		obj.offer(11);
		obj.offer(57);
		obj.offer(37);
		//obj.add(null);
		obj.offer(47);
		
		System.out.println("Output:"+obj);
		int id=obj.poll();
		System.out.println("Output:"+obj);
		System.out.println("after:"+id);
		int cd=obj.peek();
		System.out.println("Output:"+obj);
		System.out.println("new:"+cd);
		
		

	}

}
