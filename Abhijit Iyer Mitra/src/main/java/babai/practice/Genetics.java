package babai.practice;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import java.util.*;

public class Genetics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new LinkedList<>();
		list.add(23);
		list.add(34);
		list.add(11);
		list.add(11);
		list.add(55);
		list.add(90);
		list.add(56);
		System.out.println("LinkedList:");
		System.out.println(list);
		list.get(5);
		int d=list.get(5);
		System.out.println(d);
		System.out.println(list);
		list.set(2, 30);
		System.out.println(list);
		list.removeAll(list);
		System.out.println(list);
		
		List<Integer> obj=new ArrayList<>();
		obj.add(33);
		obj.add(12);
		obj.add(77);
		obj.add(45);
		obj.add(78);
		obj.add(99);
		System.out.println("ArrayList:");
		System.out.println(obj);
		obj.remove(2);
		System.out.println(obj);
		obj.removeAll(obj);
		System.out.println(obj);
		System.out.println("Vector");
	    Vector<Integer> vector=new Vector<>();
	    vector.add(22);
	    vector.add(78);
	    vector.add(98);
	    vector.add(10);
	    vector.add(100);
	    vector.add(48);
	    System.out.println(vector);
	    int w=vector.get(2);
	    System.out.println(w);
	    vector.remove(3);
	    System.out.println("after remove:"+vector);
	    Stack<Integer> stack=new Stack<>();
	    stack.push(23);
	    stack.push(34);
	    stack.push(57);
	    stack.push(49);
	    stack.push(60);
	    System.out.println("Stack class");
	    System.out.println(stack);
	    Queue<Integer> queue=new PriorityQueue<>(); //PQ implements min heap
	    queue.offer(33);
	    queue.offer(90);
	    queue.offer(49);
	    queue.offer(56);
	    queue.offer(89);
	    queue.offer(12);
	    System.out.println("Queue interface min heap");
	    System.out.println(queue);
	    Queue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder()); //PQ implements max heap
	    pq.offer(33);
	    pq.offer(90);
	    pq.offer(49);
	    pq.offer(56);
	    pq.offer(89);
	    pq.offer(12);
	    System.out.println("Queue interface max heap");
	    System.out.println(pq);
	    Queue<Integer> pq1=new ArrayDeque<>();
	    pq1.add(23);
	    pq1.add(45);
	    pq1.add(78);
	    pq1.add(90);
	    pq1.add(57);
	    System.out.println("ArrayDeque:");
	    System.out.println(pq1);
	    Queue<Integer> obj1=new LinkedList<>();
	    obj1.add(23);
	    obj1.add(45);
	    obj1.add(78);
	    obj1.add(90);
	    obj1.add(57);
	    System.out.println("Queue LinkedList:");
	    System.out.println(obj1);
	    
	     }

}
