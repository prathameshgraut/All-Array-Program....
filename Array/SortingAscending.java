package Array;

import java.util.Arrays;

public class SortingAscending {

	public static void main(String[] args) {
		int arr[]= {67,88,12,70,10,5};
		System.out.println("Without Ascending Order :");
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++) {
			int temp=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		System.out.println("\nPrint Ascending Format Array :");
		System.out.print("Using For Loop :-");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.print("\nUsing toString Method :-");
		System.out.print(Arrays.toString(arr));
	}

}
