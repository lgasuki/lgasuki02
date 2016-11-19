package niuke_java;

public class Test16_Merge {
	public ListNode Merge(ListNode list1, ListNode list2) {
		if(list1 == null)
			return list2;
		else if(list2 == null)
			return list1;
		ListNode mergeHead=null;
		if(list1.val<list2.val){
			mergeHead = list1;
			mergeHead.next=Merge(list1.next, list2);
		}
		else{
			mergeHead = list2;
			mergeHead.next = Merge(list1, list2.next);
		}
		return mergeHead;
	}
}
