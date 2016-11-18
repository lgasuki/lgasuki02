package niuke_java;

import java.util.ArrayList;
import java.util.Stack;

public class Test03_PrintListFromTailToHead {
	public ArrayList<Integer> printListFromTailTohead(ListNode listNode) {
		Stack<ListNode> stack = new Stack<ListNode>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		ListNode node = listNode;
		while(node != null) {
			stack.push(node);
			node = node.next;
		}
		
		while(!stack.isEmpty()) {
			list.add(stack.pop().val);
		}
		
		
		return list;
	} 
	
	class ListNode {
		int val;
		ListNode next = null;
		public ListNode(int val) {
			this.val = val;
		}
		
	}

}
