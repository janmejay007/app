
public class SelectionSort {
	public static void selectionSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int minIndex=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[minIndex]>arr[j]) {
					minIndex=j;
				}
			}
			int temp=arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=temp;
		}
		
		
	}

	public static void main(String[] args) {
		int[] arr= {1,5,7,8,6,2};
		selectionSort(arr);
		for(int i:arr) {
			System.out.print(i+" ");
		}

	}

}
