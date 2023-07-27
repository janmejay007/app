public class CircularQueueImpl
{
	static class QueueImpl{
		int r=-1;
		int f=-1;
		int size=0;
		int[] arr=new int[10];
		public boolean add(int data) {
			if(size==arr.length) {
				System.out.println("queue is full");
				return false;
			}
			if(f==-1) {
				f=r=0;
				
				arr[r++]=data;
				size++;
				return true;
			}
			if(r<=arr.length-1)
			{
				arr[r++]=data;
				size++;
				return true;
			}
			else {
				
				r=0;
				arr[r++]=data;
				size++;
				return true;
			}
		}
		public int pop() {
			if(size==0) {
				System.out.println("queue is empty");
				return -1;
			}
			else {
				int val=arr[f];
				size--;
				f++;
				return val;
			}
		}
		public int peek() {
			if(size==0) {
				System.out.println("queue is empty");
				return -1;
			}
			else {
				return arr[f];
			}
		}
		public void display() {
			if(f<r) {
				for(int i=f;i<r;i++) {
					System.out.print(arr[i]+" ");
				}
			}
			else {
				for(int i=0;i<=r;i++) {
					System.out.print(arr[i]+" ");
				}
				for(int i=f;i<arr.length;i++) {
					System.out.print(arr[i]+" ");
				}
			
			}
			System.out.println();
		}
		
 	}
	
	public static void main(String[] args) {
		QueueImpl q=new QueueImpl();
		q.add(10);
		q.add(11);
		q.add(21);
		q.add(15);
		q.add(31);
		q.add(12);
		q.add(11);
		q.add(21);
		q.add(15);
		q.add(31);
	
		q.display();
		System.out.println();
		System.out.println(q.pop());
		q.display();
		q.add(12);
		q.display();
		System.out.println();
		
		System.out.println(q.pop());
		
		System.out.println(q.pop());
		q.add(22);
		q.display();
		
		
	}

}
