package Array;

import java.util.Arrays;

public class MoveAllZeroInEnd {
public static void main(String[] args) {
	int arr[]= {0,1,2,0,3,4,5};
	int j=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]!=0) {
			arr[j]=arr[i];
			j++;
		}
	}while(j<arr.length) {
		arr[j]=0;
		j++;
	}
	System.out.println(Arrays.toString(arr));
}
}
