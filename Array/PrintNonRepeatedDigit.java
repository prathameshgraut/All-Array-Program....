package Array;

import java.util.Arrays;

public class PrintNonRepeatedDigit {
public static void main(String[] args) {
	int arr[]= {9,7,3,1};
	int count=0;
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {
			for(int k=0;k<arr.length;k++) {
				for(int l=0;l<arr.length;l++) {
					if(i!=j && i!=k && i!=l && j!=k && j!=l && k!=l) {
						count++;
					}
				}
			}
		}
	}
	int store[]=new int[count];
	int p=0;
	int save=0;
	
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {
			for(int k=0;k<arr.length;k++) {
				for(int l=0;l<arr.length;l++) {
					if(i!=j && i!=k && i!=l && j!=k && j!=l && k!=l) {
						store[p]=arr[i]*1000+arr[j]*100+arr[k]*10+arr[l];
						p++;
					}
				}
			}
		}
	}
	System.out.println(Arrays.toString(store));
}
}
