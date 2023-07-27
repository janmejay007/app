
public class LinkedListAll {
	
	static class Node{
		Node next,head;
		int data;
		public Node() {
			head=null;
		}
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
		
		@SuppressWarnings("unused")
		public boolean insert(int data) {
			Node newNode=new Node(data);
			
			if(newNode==null)
			{
				return false;
			}
			if(head==null) {
				head=newNode;
				return true;
			}
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newNode;
			return false;
		}
		public void insertAtPos(int data,int pos) {
			Node newNode=new Node(data);
			if(pos==1) {
				newNode.next=head;
				head=newNode;
				return;
			}
			Node temp=head;
			for(int i=1;i<pos-1;i++) {
				temp=temp.next;
			}
			newNode.next=temp.next;
			temp.next=newNode;
			return;
			
		}
		public void delete(int pos) {
			if(pos==1) {
				head=head.next;
				return;
			}
			Node temp=head;
			for(int i=1;i<pos-1;i++) {
				temp=temp.next;
			}
			temp.next=temp.next.next;
			return;
		}
		
		public void reverse() {
			Node curr=head;
			Node temp=null;
			Node prev=null;
			while(curr!=null) {
				temp=curr.next;
				curr.next=prev;
				prev=curr;
				curr=temp;
			}
			while(prev!=null) {
				System.out.print(prev.data+"  ");
				prev=prev.next;
			}
		}
		public void deleteByVal(int val) {
			Node temp=head;
			while(temp.next.data!=val) {
				temp=temp.next;
			}
			temp.next=temp.next.next;
			
		}
		public void removeDuplicate() {
			Node bef=head;
			
			while(bef!=null) {
				Node aft=bef;
				while(aft.next!=null) {
					if(bef.data==aft.next.data) {
						aft.next=aft.next.next;}
						else {
						aft=aft.next;}
					}
				bef=bef.next;
				}
			
			}
			
		
	
		
		public void display() {
			Node show=head;
			while(show!=null)
			{
				System.out.print(show.data+" ");
				show=show.next;
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		Node n1=new Node();
		n1.insert(12);
		n1.insert(14);
		n1.insert(15);
//		n1.display();
		n1.insert(90);
		n1.insert(12);
		n1.insert(14);
		n1.insert(15);
		n1.insert(90);
		n1.insertAtPos(23, 2);
		n1.insertAtPos(33, 3);
		n1.insertAtPos(43, 5);
	
////		n1.display();
////		n1.delete(3);
////		n1.display();
////		n1.reverse();
//		n1.deleteByVal(23);
		n1.display();
	
		n1.removeDuplicate();
		System.out.println();
		n1.display();
	}
	

}
