package com.company.DoublyLinkedList;

class ListNode {
    ListNode prev;
    String data;
    ListNode next;  // Pointer to the next node

    public ListNode(String value) {
        this.prev = null;
        this.data = value;
        this.next = null;
    }
}

public class DoblyListNode_Create {
    public static void main(String[] args) {
        // Step 1: Creating the initial doubly linked list (A ↔ B ↔ C)
        ListNode head = new ListNode("A");
        ListNode h1 = new ListNode("B");
        ListNode h2 = new ListNode("C");

        // Linking nodes (A ↔ B ↔ C)
        head.next = h1;
        h1.prev = head;
        h1.next = h2;
        h2.prev = h1;

        // Print list in both directions
        System.out.println("Forward Traversal:");
        printForward(head);

        System.out.println("Backward Traversal:");
        printBackward(h2);  // Pass the last node for backward traversal
    }

    // Utility function to print the linked list forward
    public static void printForward(ListNode node) {
        while (node != null) {
            System.out.print(node.data);
            if (node.next != null) System.out.print(" ↔ ");
            node = node.next;
        }
        System.out.println();
    }

    // Utility function to print the linked list backward
    public static void printBackward(ListNode node) {
        while (node != null) {
            System.out.print(node.data);
            if (node.prev != null) System.out.print(" ↔ ");
            node = node.prev;
        }
        System.out.println();
    }
}
