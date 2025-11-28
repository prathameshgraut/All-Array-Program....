package Array;

import java.util.Arrays;

public class MergeArray {
	static int  print(int arr[],int srr[],int merg[]) {
		
		for(int i=0;i<arr.length;i++) {
			merg[i]=arr[i];
		}
		for(int j=0;j<srr.length;j++) {
			merg[arr.length+j]=srr[j];
		}
		return merg.length;
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int srr[]= {6,7,8,9,10};
		int merg[]=new int [arr.length+srr.length];
		print(arr,srr,merg);
		System.out.print(Arrays.toString(merg));
	}

}
