package com.yifan.linkedlist;

public class Linked_List_Cycle_II {
	 public ListNode detectCycle(ListNode head) {
	        ListNode slow =head;
	        ListNode fast =head;
	        while(fast!=null&&fast.next!=null){//fast跑的比slow快，所以判别一个就行了
	            fast=fast.next.next;
	            slow=slow.next;
	            if(fast==slow){
	                ListNode slow2=head;//这里让fast变成slow
	                while(slow2!=slow){
	                    slow=slow.next;
	                    slow2=slow2.next;
	                }
	                return slow;
	            }
	        }
	        return null;
	 }
}
