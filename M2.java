
public class M2 {
	
	public static void merge(int[] arr,int l,int mid,int r) {
		
		int n1=mid+1-l;
		int n2=r-mid;
		int[] arr1=new int[n1];
		int[] arr2=new int[n2];
		
		for(int i=0;i<n1;i++) {arr1[i]=arr[i+l];}
		for(int j=0;j<n2;j++) {arr2[j]=arr[mid+1+j];}
		int i=0,j=0,k=l;
		while(i<n1&&j<n2) {
			if(arr1[i]<arr2[j]) {
				arr[k++]=arr2[j++];
				
			}
			else if(arr2[j]<arr1[i]) {
				arr[k++]=arr1[i++];
			}
			else {
				i++;
				j++;
			}
		}
		while(i<n1) {
			arr[k++]=arr1[i++];
		}
		while(j<n2) {
			arr[k++]=arr2[j++];
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int n1=mid+1-l;
//		int n2=r-mid;
//		
//		int[] arr1=new int[n1];
//		int[] arr2=new int[n2];
//		
//		for(int i=0;i<n1;i++) {arr1[i]=arr[l+i];}
//		for(int j=0;j<n2;j++) {arr2[j]=arr[mid+1+j];}
//		
//		int i=0,j=0,k=l;
//		while(i<n1&&j<n2) {
//			if(arr1[i]<arr2[j]) {
//				arr[k++]=arr2[j++];
//			}
//			else if(arr2[j]<arr1[i]) {
//				arr[k++]=arr1[i++];
//			}
//			else {
//				i++;
//				j++;
//			}
//		}
//		while(i<n1) {
//			arr[k++]=arr1[i++];
//		}
//		while(j<n2) {
//			arr[k++]=arr2[j++];
//		}

	}
	

	public static void mergeSort(int[] arr,int l,int r) {
		if(l>=r) {
			return;
		}
		int mid=(l+r)/2;
		mergeSort(arr, l, mid);
		mergeSort(arr, mid+1, r);
		merge(arr,l,mid,r);
		
	}
	public static void main(String[] args) {
		
		int[] arr= {7,4,-1,0,23,3,45,2};
		int l=0;
		int r=arr.length-1;
		mergeSort(arr, l, r);
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
		

	}

}
