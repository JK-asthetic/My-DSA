package com.company.DoublyLinkedList;

public class Listnode_delete {

	
	public static ListNode addFirst(ListNode head, String string) {
		ListNode node = new ListNode(string);
		node.next = head;
		head = node;
		return head;
	}
	
	public static ListNode deleteFirst(ListNode head) {
		ListNode node = head.next;
		head = node;
		return head;
	}
	
	public static void deleteLast(ListNode head) {
		while(head.next.next != null) {
			head = head.next;
		}
		head.next = null;
	}
	

	
	
	
	public static void main(String[] args) {
		ListNode head = new ListNode("A");
		ListNode tail = head;  ///intitially the tial value is smae as h 
		
		// to add befour the head node 
		head = addFirst(head, "B");
        head = addFirst(head, "C");
        head = addFirst(head, "D");
        head = addFirst(head, "E");
	
		printList(head);

		// Deleting the head node
        head = deleteFirst(head);
        
        // Deleting the tail node
        deleteLast(head);
        

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

