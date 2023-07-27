
public class InsertionSort {
	public static void insertioSort(int[] arr) {
		int j;
		for(int i=1;i<arr.length;i++) {
			j=i-1;
			int temp=arr[i];
			while(j>=0 && arr[j]>temp) {
				arr[j+1]=arr[j];
				j=j-1;
			} 
			arr[j+1]=temp;
		}
	}

	public static void main(String[] args) {
		int[] arr= {1,5,7,8,6,2};
		insertioSort(arr);
		for(int i:arr) {
			System.out.print(i+" ");
		}
		

	}

}
