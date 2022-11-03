package linkedList;
import java.util.*;
public class CircularLinkedList {
	
	
	 
	    // Structure for a
	    // node
	    static class Node {
	        int data;
	        Node next;
	    };
	 
	    // Function to insert a node
	    // at the beginning of Circular
	    // LL
	    static Node push(Node head_ref, int data)
	    {
	        Node ptr1 = new Node();
	        Node temp = head_ref;
	        ptr1.data = data;
	        ptr1.next = head_ref;
	 
	        // If linked list is not
	        // null then set the next
	        // of last node
	        if (head_ref != null) {
	            while (temp.next != head_ref) {
	                temp = temp.next;
	            }
	            temp.next = ptr1;
	        }
	 
	        // For the first node
	        else
	            ptr1.next = ptr1;
	 
	        head_ref = ptr1;
	        return head_ref;
	    }
	 
	    // Function to print nodes in
	    // the Circular Linked List
	    static void printList(Node head)
	    {
	        Node temp = head;
	        if (head != null) {
	            do {
	                // Print the data
	                System.out.print(temp.data + " ");
	                temp = temp.next;
	            } while (temp != head);
	        }
	    }
	 
	    // Driver Code
	    public static void main(String[] args)
	    {
	        // Initialize list as empty
	        Node head = null;
	 
	        // Created linked list will
	        // be 11.2.56.12
	        head = push(head, 12);
	        head = push(head, 56);
	        head = push(head, 2);
	        head = push(head, 11);
	 
	        System.out.print("Contents of Circular"
	                         + " Linked List\n ");
	       
	        // Function call
	        printList(head);
	    }
	}

