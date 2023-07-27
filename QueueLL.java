
public class QueueLL {
	
	static class Node{
		int data;
		Node next;
		Node head;
		int size;
		public Node() {
			head=null;
		}
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
		@SuppressWarnings("unused")
		public boolean add(int data) {
			Node newNode=new Node(data);
			if(newNode==null)
				return false;
			if(head==null) {
				head=newNode; size++; return true;}
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newNode;
			size++;
			return true;
		}
		
		public void display() {
			if(size==0) {
				System.out.println("queue is empty");
			}
			Node show=head;
			while(show!=null)
			{
				System.out.print(show.data+" ");
				show=show.next;
			}
		}
		public int pop() {
			int del=head.data;
			head=head.next;
			size--;
			return del;
		}
		public int peek() {
			return head.data;
		}
		
	}
	public static void main(String[] args) {
		Node n1=new Node();
		n1.add(11);
		n1.add(12);
		n1.add(13);
		n1.add(14);
		n1.add(15);
		n1.display();
		System.out.println(n1.pop());
		n1.display();
		System.out.println(n1.size);

	}

}
