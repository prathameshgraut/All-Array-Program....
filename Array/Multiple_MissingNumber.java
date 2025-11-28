package Array;

public class Multiple_MissingNumber {
public static void main(String[] args) {
	int arr[]= {11,12,14,15};
	int missing=1;
	int i=0;
	
	while(missing<=arr[arr.length-1]) {
		if(arr[i]==missing) {
			i++;
		}else {
			System.out.print(missing+" ");
		}
		missing++;
	}
	}
}
