package Arr_Basic;

public class Rotate_arr_by_reverse {
public static void main(String[]args) {
	int[]arr= {1,2,3,4,5,6,7};
	int k=3;
	RotateArr(arr,k);
	for(int i=0;i<=arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
}
	public static void RotateArr(int arr[],int k) {
		int n=arr.length;
		k=k%n;
		Reverse(arr,0,n-1);
		Reverse(arr,0,k-1);
		Reverse(arr,k,n-1);
	}
	public static void Reverse(int []arr,int i,int j) {
		while(i<=j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
}
}
