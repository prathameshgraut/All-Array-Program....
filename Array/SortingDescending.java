package Array;

import java.util.Arrays;

public class SortingDescending {

	public static void main(String[] args) {
		int arr[]= {5,25,10,45,68,70};
		System.out.println("Print Without Sorting :-"+Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++) {
			int temp=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		System.out.println("\nPrint After Descending Format :-"+Arrays.toString(arr));
	}
}
