package Array;

public class FindLargestAndSecondlargest {
static void print(int arr[]) {
	int largest=arr[0],secondlargest=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>largest) {
			secondlargest=largest;
			largest=arr[i];
		}else if (arr[i]>secondlargest) {
			secondlargest=arr[i];
		}
	}
	System.out.print("Larest Number Array  :"+largest);
	System.out.print("\nSecond Largest Array :"+secondlargest);
}
public static void main(String[] args) {
	int arr[]= {10,20,30,40,50};
	print(arr);
}
}
