package niuke_java;

import java.util.LinkedList;
import java.util.Queue;

public class Test0501_Queue {
	Queue<Integer> q1 = new LinkedList<Integer>();
	Queue<Integer> q2 = new LinkedList<Integer>();
	
	
	/*public static void main(String[] args) {
		Test0501_Queue tq = new Test0501_Queue();
		tq.push(1);
		tq.push(2);
		tq.push(3);
		System.out.print(tq.pop());
		System.out.print(tq.pop());
		tq.push(4);
		tq.push(5);
		System.out.print(tq.pop());
		tq.push(6);
	}*/
	
	public void push(int node) {
		if(q2.size() == 0) {
			q1.add(node);
		} else {
			q2.add(node);
		}
	}
	
	public int pop() {
		if(q1.size() == 0 && q2.size() == 0) {
			return -1;
		} else if(q1.size() != 0){
			for(int i = 0; i < q1.size(); i++) {
				q2.add(q1.poll());
			}
			return q1.poll();
		}else {
			for(int i = 0; i < q2.size(); i++) {
				q1.add(q2.poll());
			}
			return q2.poll();
		}
			
	}
	
	
	
	

}
