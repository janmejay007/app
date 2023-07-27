
public class QuickSort {

	public static void quickSort(int[] arr,int low,int high) {
		if(low<high) {
		int a=partition(arr,low,high);
		quickSort(arr, low, a-1);
		quickSort(arr, a+1, high);
		}
		
	}
	static int partition(int[] arr,int low,int high) {
		
		int i=low,j=low;
		int pivot=arr[high];
		while(i<=high) {
			if(arr[i]<=pivot) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j++;
			}
			i++;
			
		}
		
		return j-1;
		
		
	}
	
	public static void main(String[] args) {
		
		int[] arr= {1,4,6,3,7,11,78,3,22,5,-5};
		quickSort(arr, 0, arr.length-1);
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}

}
