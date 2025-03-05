package com.company.SingleLinkedList;

public class ListNode_insert {
	public static ListNode addMiddle(ListNode head, String string, int num) {
		if(num == 0) {
			addFirst(head, string);
		}else {
			int count = 0;
			ListNode node = new ListNode(string);
			ListNode temp = head;
			while(count < num-1) {
				temp = temp.next;
				count ++;
			}
			if(temp == null) {
				System.out.println("Not valid position");
			}
			node.next = temp.next;
			temp.next = node;
		}
		return head;
	}
	
	public static ListNode addFirst(ListNode head, String string) {
		ListNode node = new ListNode(string);
		node.next = head;
		head = node;
		return head;
	}
	
	public static ListNode addLast(ListNode head, String string) {
		ListNode node = new ListNode(string);
		head.next = node;
		head = node;
		return head;
	}
	
	
	
	public static void main(String[] args) {
		ListNode head = new ListNode("A");
		ListNode tail = head;  ///intitially the tial value is smae as h 
		
		// to add befour the head node 
        head = addFirst(head, "B");
        head = addFirst(head, "C");
        head = addFirst(head, "D");
        head = addFirst(head, "E");
        
		// to add after the head node 
        tail = addLast(tail, "F");
        tail = addLast(tail, "G");
        
		printList(head);
		
        addMiddle(head, "Z", 3);
        addMiddle(head, "T", 7);
        

		printList(head);
	}
	
	public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.println("null");
    }
}
