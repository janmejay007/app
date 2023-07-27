//
//public class CircularLinkedList {
//	static class Node{
//		int data;
//		Node next,head;
//		public Node() {
//			this.head=null;
//		}
//		public Node(int data) {
//			this.data=data;
//			this.next=null;
//		}
//		public boolean insert(int data) {
//			Node newNode=new Node(data);
//			if(head==null) {
//				head=newNode;
//				newNode.next=newNode;
//				return true;
//			}
//			Node temp=head;
//			while(temp.next!=head) {
//				temp=temp.next;
//			}
//			temp.next=newNode;
//			newNode.next=head;
//			return true;
//		}
//		public void insertAtPos(int data,int pos) {
//			Node newNode=new Node(data);
//			if(pos==1) {
//				Node temp=head;
//				while(temp.next!=head) {
//					temp=temp.next;
//				}
//				newNode.next=head;
//				temp.next=newNode;
//				head=newNode;
//				return;
//			}
//			Node temp=head;
//			for(int i=1;i<pos-1;i++) {
//				temp=temp.next;
//			}
//			newNode.next=temp.next.next;
//			temp.next=newNode;
//			return;
//		}
//		public void deleteFirst() {
//			Node temp=head;
//			while(temp.next!=head) {
//				temp=temp.next;}
//			temp.next=head.next;
//			head=temp;
//		}
//		public void display() {
//			Node show=head;
//			while(show.next!=head) {
//				System.out.print(show.data+" ");
//				show=show.next;
//			}
//			System.out.print(show.data);
//		}
//		
//	}
//	
//	public static void main(String[] args) {
//		Node n1=new Node();
//		n1.insert(11);
//		n1.insert(12);
//		n1.insert(13);
//		n1.insert(14);
//		n1.insert(15);
//		n1.insertAtPos(44, 1);
//		n1.insertAtPos(34, 4);
//		n1.display();
//		n1.deleteFirst();
//		System.out.println();
//		n1.display();
//	
		
//	}
//
//}
		



public class CLL {
    private Node head;

    class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void insertAtLast(int val) {
        if(head==null) {
            insertATHead(val);
            return;
        }
        Node newNode = new Node(val);
        Node temp = head;
        while (temp.next != head) 
        temp = temp.next;
        temp.next = newNode;
        newNode.next = head;
        temp = newNode;
    }

    private void insertATHead(int val) {
        Node newNode = new Node(val);
       if(head==null){
           newNode.next=newNode;
           head=newNode;
           return;
       }
       Node temp=head;
       while (temp.next!=head)temp=temp.next;
       temp.next=newNode;
       newNode.next=head;
       head=newNode;
    }

    public void delete(int pos){
        if(pos==1){
            deleteAtHead();
            return;
        }
        Node temp=head;
        int count=1;
        while (count!=pos-1){
            temp=temp.next;
            count++;
        }
        temp.next=temp.next.next;

    }

    private void deleteAtHead() {
        Node temp=head;
        while (temp.next!=head) temp=temp.next;
        temp.next=head.next;
        head=head.next;
    }

    public void display(){
        if(head==null) return;
        Node temp=head;
        do{
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }while (temp!=head);
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        CLL cl=new CLL();
        cl.insertAtLast(5);
        cl.insertAtLast(4);
        cl.insertAtLast(6);
        cl.insertATHead(3);
        cl.display();
        cl.delete(2);
        cl.display();
        cl.deleteAtHead();
        cl.display();
    }
}
