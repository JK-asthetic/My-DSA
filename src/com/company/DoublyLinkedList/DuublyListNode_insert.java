package com.company.DoublyLinkedList;

public class DuublyListNode_insert {
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
			node.prev = temp;
		}
		return head;
	}
	
	public static ListNode addFirst(ListNode head, String string) {
		ListNode node = new ListNode(string);
		node.next = head;
		head.prev = node;
		head = node;
		return head;
	}
	
	public static void addLast(ListNode head, String string) {
		ListNode node = new ListNode(string);
		while(head.next != null) {
			head = head.next;
		}
		head.next = node;
		node.prev = head;
	}
	
	
	
	public static void main(String[] args) {
		ListNode head = new ListNode("A");
		
		System.out.println("Stating Point : " + head.data);
		
		// to add befour the head node 
        head = addFirst(head, "B");
        head = addFirst(head, "C");
        head = addFirst(head, "D");
        head = addFirst(head, "E");
        
		// to add after the head node 
        addLast(head, "F");
        addLast(head, "G");
        
		printForward(head);
		
        addMiddle(head, "Z", 3);
        addMiddle(head, "T", 7);
        

		printForward(head);
	}
	
	public static void printForward(ListNode node) {
        while (node != null) {
            System.out.print(node.data);
            if (node.next != null) System.out.print(" ↔ ");
            node = node.next;
        }
        System.out.println();
    }

}
