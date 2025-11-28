package Array;

import java.util.Arrays;

public class SwapArray {
	static void print(int arr[],int srr[],int temp[]) {
		System.out.println("Before Swapping =>");
		System.out.print("Arr[] :"+Arrays.toString(arr));
		System.out.print("\nSrr[] :"+Arrays.toString(srr));
		for(int i=0;i<arr.length;i++) {
			temp[i]=arr[i];
		}
		for(int j=0;j<srr.length;j++) {
			arr[j]=srr[j];
		}
		for(int k=0;k<temp.length;k++) {
			srr[k]=temp[k];
		}
		System.out.println("\n\nAfter Swapping =>");
		System.out.print("Arr[] :"+Arrays.toString(arr));
		System.out.print("\nSrr[] :"+Arrays.toString(srr));
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int srr[]= {6,7,8,9,10};
		int temp[]=new int[arr.length];
		print(arr,srr,temp);
	}

}
