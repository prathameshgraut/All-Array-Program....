package Array;

import java.util.Arrays;

public class PrintArray {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		int srr[]=new int[5];
		srr[0]=10;
		srr[1]=20;
		srr[2]=30;
		srr[3]=40;
		srr[4]=50;
		System.out.println("\n"+Arrays.toString(srr));
	}

}
