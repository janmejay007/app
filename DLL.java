package DoublyLinkedListP;

public class DLLAllOp {
	static class Node {
		private int data;
		Node temp, tail;
		private Node prev, next, head;

		public Node() {
			this.head = null;
		}

		public Node(int data) {
			this.data = data;
			this.prev = this.next = null;
		}

		

		@SuppressWarnings("unused")
		public boolean insertData(int data) {
			Node newNode = new Node(data);
			if (newNode == null) {
				return false;
			}
			if (head == null) {
				newNode.prev = head;
				head = newNode;
				return true;
			}
			temp = head;
			tail = head;
			while (temp.next != null) {
				temp = temp.next;
				tail = temp;
			}
			temp.next = newNode;
			newNode.prev = temp;
			tail = temp.next;
			// head.prev=newNode;
			return true;
		}

		@SuppressWarnings("unused")
		public boolean insertAtPos(int data, int pos) {
			Node newNode = new Node(data);
			if (newNode == null) {
				return false;
			}
			if (head == null && pos < 1) {
				newNode.prev = head;
				head = newNode;
				return true;
			}
			if (pos == 1) {
				newNode.next = head;
				head.prev = newNode;
				head = newNode;
				return true;
			}

			Node curr = head;
			for (int i = 1; i < pos - 1; i++) {
				curr = curr.next;
				if (curr == null) {
					return false;
				}
			}
			curr.next.prev = newNode;
			newNode.prev = curr;
			newNode.next = curr.next;
			curr.next = newNode;
			return true;

		}
	public void deleteByPos(int pos) {
		if(head==null) {
			return;
		}
		if(pos==1) {
			head=head.next;
			head.prev=null;
			return;
		}
		
	}

		public void displayForward() {
			Node show = head;
			while (show != null) {
				System.out.print(show.data + " ");
				show = show.next;
			}
		}

		public void displayReverse() {
			while (tail != null) {
				System.out.print(tail.data + " ");
				tail = tail.prev;
			}

		}
	}

	public static void main(String[] args) {
		Node n1 = new Node();
		n1.insertData(10);
		n1.insertData(11);
		n1.insertData(12);
		n1.insertData(13);
		n1.insertData(14);
		n1.displayForward();
		System.out.println();
		n1.displayReverse();
		System.out.println();
		n1.insertAtPos(56, 4);
		n1.displayForward();
		System.out.println();
		n1.insertAtPos(36, 1);
		n1.displayForward();
		System.out.println();
		n1.deleteByPos(1);;
		n1.displayForward();
		

	}

}
