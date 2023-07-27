
public class QueueArray {
	
	static class QueueImpl{
		int f=-1;
		int r=-1;
		int[] arr=new int[10];
		int size=0;
		
		public void add(int data) {
			if(f==-1) {
				f=r=0;
				arr[r++]=data;
				size++;
			}
			else {
				arr[r++]=data;
				size++;
			}
		}
		public int pop()
		{
			if(size==0)
			{
				System.out.println("queue is empty");
				return -1;
			}
			f++;
			size--;
			return arr[f-1];
		}
		public int peek() {
			if(size==0) {
				System.out.println("Queue is empty");
				return -1;
			}
			else {
				return arr[f];
			}
		}
		public void display() {
			for(int i=f;i<r;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
	}

	
	public static void main(String[] args) {
		QueueImpl q1=new QueueImpl();
		q1.add(10);
		q1.add(11);
		q1.add(14);
		q1.add(21);
		q1.add(17);
		q1.display();
		
		System.out.println(q1.pop());
		System.out.println(q1.peek());
		
		
		
		
		
		

	}

}
