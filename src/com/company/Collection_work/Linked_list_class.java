package com.company.Collection_work;


public class Linked_list_class {
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
		// Head nodei is A
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
    }

    // Utility function to print the linked list
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.println("null");
    }
}
