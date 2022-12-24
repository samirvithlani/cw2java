package collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

//q --> LinkedList PriorityQue
public class Queuedemo {

	public static void main(String[] args) {
		
		//unorder--->
		Queue<String> q = new PriorityQueue<String>();
		q.add("raj");
		q.add("jay");
		q.add("amit");
		q.add("akshit");
		q.add("abhi");
		
		
		//System.out.println(q.element());
		
		for(String s:q) {
			
			System.out.println(s);
		}
		
	}
}
