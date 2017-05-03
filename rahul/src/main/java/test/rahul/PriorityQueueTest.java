package test.rahul;

import java.util.PriorityQueue;

public class PriorityQueueTest {

	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Amit");
		queue.add("Sumit");
		queue.add("Rahul");
		queue.add("Ketan");
		System.out.println("Remove "+queue.remove());
		System.out.println("Poll "+queue.poll());
		System.out.println("Finally: ");
		for(String str : queue){
			System.out.println(str);
		}
	}

}
