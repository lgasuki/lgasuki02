package niuke_java;

import java.util.Stack;

public class Test05_Stack {
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();
	
	public void push(int node) {
		stack1.push(new Integer(node));
	}
	
	public int pop() {
		while(!stack2.isEmpty()) {
			return stack2.pop();
		} 
		while(!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		}
		return stack2.pop();
	}

}
