package niuke_java;

public class Test14_FindKthToTail {
	public ListNode FindKthToTail(ListNode head, int k) {
		if(head == null || k <= 0) 
			return null;
		
		ListNode preNode = head;
		ListNode lastNode = head;
		
		for(int i = 1; i < k; i++) {
			if(preNode.next != null)
				preNode = preNode.next;
			else 
				return null;
		}
		
		while(preNode.next != null) {
			preNode = preNode.next;
			lastNode = lastNode.next;
		}
		return lastNode;
	}
}



class ListNode {
	int val;
	ListNode next = null;
	
	public ListNode(int val) {
		this.val = val;
	}

	public ListNode() {
	}
}
