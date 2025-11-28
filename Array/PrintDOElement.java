package Array;

public class PrintDOElement {
	static void print(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			int fact=0;
			for(int j=i+1;j<arr.length;j++) {
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
	public static void main(String[] args) {
		int arr[]= {1,2,1,2,3,4,5,4,6};
	    print(arr);

	}
}
