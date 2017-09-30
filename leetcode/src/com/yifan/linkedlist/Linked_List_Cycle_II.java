package com.yifan.linkedlist;

public class Linked_List_Cycle_II {
	 public ListNode detectCycle(ListNode head) {
	        ListNode slow =head;
	        ListNode fast =head;
	        while(fast!=null&&fast.next!=null){//fast�ܵı�slow�죬�����б�һ��������
	            fast=fast.next.next;
	            slow=slow.next;
	            if(fast==slow){
	                ListNode slow2=head;//������fast���slow
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
