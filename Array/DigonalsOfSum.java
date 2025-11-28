package Array;

public class DigonalsOfSum {
public static void main(String[] args) {
	int arr[][]= {
			{1,2,3},
			{4,5,6},
			{7,8,9}
	};
	int sum=arr.length;
	int p=0;
	int s=0;
	
	for(int i=0;i<sum;i++) {
		p=p+arr[i][i];
		s=s+arr[i][sum-i-1];
	}
	System.out.println("Primary Digonals   :"+p);
	System.out.println("Secondary Digonals :"+s);
	int total=p+s;
	
	if(sum%2==1) {
		total=total-arr[sum%2][sum%2];
	}
	System.out.println("Sum Of Digonals :"+total);
}
}
