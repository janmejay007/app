
public class BubbleSort {
	public static void bubbleSort(int[] arr) {
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] arr= {3,6,1,-22,56,90,13,45,-2};
		bubbleSort(arr);
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
	}

}
