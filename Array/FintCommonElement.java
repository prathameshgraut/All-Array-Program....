package Array;

public class FintCommonElement {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,2,1};
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}if(count==1) {
				System.out.println(arr[i]+" ");
			}
		}
	}

}
