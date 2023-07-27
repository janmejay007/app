
public class StackLL {
	
	static class  Node{
		int data;
		Node next;
		Node head;
		int size=0;
		public Node() {
			this.head=null;
		}
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
		
		@SuppressWarnings("unused")
		public boolean push(int data) {
			Node newNode=new Node(data);
			if(newNode==null) {
				return false;}
			if(head==null) {
				head=newNode;
				size++;
				return true;}
			newNode.next=head;
			head=newNode;
			size++;
			return true;
		}
		public int  pop() {
			if(size==0)
				return -1;
			int del=head.data;
			head=head.next;
			size--;
			return del;}
		
		public int peek() {
			if(size==0)
				return -1;
			else
			return head.data;
		}
		public void display() {
			if(size==0) {
				System.out.println("list is empty");
			}
			Node show=head;
			while(show!=null) {
				System.out.print(show.data+" ");
				show=show.next;
			}
		}
		
	}
	
	public static void main(String[] args) {
		Node n1=new Node();
		n1.push(10);
		n1.push(20);
		n1.push(30);
		n1.push(40);
		n1.push(50);
		n1.display();
		System.out.println();
		System.out.println(n1.size);
		System.out.println(n1.pop());
		n1.display();
		System.out.println();
		System.out.println(n1.peek());
		n1.display();
		System.out.println();
		System.out.println(n1.size);
	}

}
