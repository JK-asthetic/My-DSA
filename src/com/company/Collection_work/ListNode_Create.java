package com.company.Collection_work;

class ListNode {
    String data;
    ListNode next;  // Pointer to the next node

    public ListNode(String value) {
        this.data = value;
        this.next = null;
    }
}

public class ListNode_Create {
    public static void main(String[] args) {
        // Step 1: Creating the initial linked list (A → B)
        ListNode head = new ListNode("A");
        ListNode h1 = new ListNode("B");
        head.next = h1; // Link A → B

        printList(head);
        
        head = head.next; // A → B now becomes the head

        printList(head);
    }

    // Utility function to print the linked list
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.data + " → ");
            node = node.next;
        }
        System.out.println("null");
    }
}
