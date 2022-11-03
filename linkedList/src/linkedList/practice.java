package linkedList;



public class practice {
 static class Node {
	 int data;
	 Node next;
 }
 static void printList(Node n) {
	 while(n!=null) {
		 System.out.print(n.data+" ");
		 n=n.next;
	 }
 }
 public static void main(String[] args) {
	Node  head = null;
	Node  second = null;
	Node  thrid = null;
	
	head=new Node();
	second=new Node();
	thrid=new Node();
	head.data=1;
	head.next=second;
	second.data=2;
	second.next=thrid;
	thrid.data=3;
	thrid.next=null;
	printList(head);
}

}
