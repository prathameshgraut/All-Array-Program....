package Array;

public class Single_MissingNumber {

	public static void main(String[] args) {
		int arr[]= {1,2,3,5}; //expected=14
		int store=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=i+1) {
				store=i+1;
				break;
			}
		}
		System.out.print("Print Single Missing Number:"+store);
	}

}
