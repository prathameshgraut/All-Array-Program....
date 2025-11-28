package Array;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,15,20,25,30};
		int min=arr[0];
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				max=min;
				min=arr[i];
			}else if(arr[i]>max){
				max=arr[i];
			}
		}
		System.out.println("Minimum Number :"+min);
		System.out.println("Maximum Number :"+max);
	}

}
