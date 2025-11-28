package Array;

import java.util.Arrays;

public class EvenOddArray {

	public static void main(String[] args) {
		int arr[]= {60,83,12,11,10,35};
		int e=0;
		int o=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				e++;
			}else if(arr[i]%2!=0) {
				o++;
			}
		}
		int Even[]=new int[e];
		int E=0;
		int Odd[]=new int[o];
		int O=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				Even[E]=arr[i];
				E++;
			}else if(arr[i]%2!=0) {
				Odd[O]=arr[i];
				O++;
			}
		}
		System.out.println("Print Original Array :"+Arrays.toString(arr));
		System.out.println("Even Element Array   :"+Arrays.toString(Even));
		System.out.println("Odd Element Array    :"+Arrays.toString(Odd));
	}

}
