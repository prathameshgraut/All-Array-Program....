package Array;

public class PritnDuplicateOriginal {

	public static void main(String[] args) {
		int arr[]= {1,2,1,3,2,4,5};
		for(int i=0;i<arr.length;i++) {
			int fact=0;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					fact=1;
				}
			}if(fact!=1) {
				System.out.println("Print Original  :"+arr[i]);
			}else if(fact==1) {
				System.out.println("Print Duplicate :"+arr[i]);
			}
		}
	}

}
