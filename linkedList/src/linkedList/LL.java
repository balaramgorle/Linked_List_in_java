package linkedList;


	public class LL {

		class Node {
			int data;
			Node next;
			Node prev;

			public Node(int data) {
				this.data = data;
				this.next = null;
				this.prev = null;
			}
			
		}
		
		Node head = null;
		Node tail = null;
		int size = 0;

		public int addFront(int data) {
			Node temp = new Node(data);
			if (head == null) {
				head = temp;
				tail = temp;
			} else {
				temp.next = head;
				head = temp;
			}
			return data;
//			size++;
		}

		public void addLast(int data) {
			Node temp = new Node(data);
			if (head == null) {
				head = tail = temp;
			}
//			head - (1) 2 3 45 6 6 76 7 7 7 7 7 (7)-tail link is added to - temp - 62
			else {
				tail.next = temp;
				tail = temp;
			}
			size++;
		}
		public void delLast()
		{
			Node temp = head;
			if(size == 0)
			{
				System.out.println(" list is empty ");
			}
			if( size == 1)
			{
				head = tail = null;
				size--;
			}
			while(temp.next!=tail)
			{
				temp = temp.next;
			}
			temp.next = null;
			tail=temp;
			size--;	
		}
		public void delFront()
		{
			Node temp = head;
			if(size == 0)
			{
				System.out.println(" list is empty ");
			}
			if( size == 1)
			{
				head = tail = null;
				size--;
			}
//			(haed)-12,(head)-3253,535,34,6,4,6,4,4,6-(tail)
			head = head.next;
			size--;
		}
		public void addMid(int position, int data)
		{
			if(position> size)
			{
				System.out.println(" not possible ");
			}
			if(position ==0)
			{
				addFront(data);
				return;
			}
			if(position==size)
			{
				addLast(data);
				return;
			}
			Node new_node = new Node(data);
			Node current = head;
//			(head)-11,32,12,432,4,4,43,2-(tail)         data- 33
			for(int i=0;i<position-2;i++)
			{
				current  = current.next;
			}
			Node next  = current.next;
			current.next = new_node;
			new_node.next = next;
			size++;
		}
		public void print() {
			Node temp = head;
			while (head != null) {
				System.out.println(temp.data);
				temp = temp.next;
			}
		}

		public static void main(String[] args) {

			LL head = new LL();

			head.addFront(1);
			head.addFront(2);
			head.addFront(3);
			head.addFront(4);
			head.addFront(5);
			
//			head.addLast(6);
//			head.addLast(7);
//			head.addLast(8);
//			head.addLast(9);
//			head.addLast(10);	
			head.print();

		}
}
