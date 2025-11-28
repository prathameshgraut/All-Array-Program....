package Array;

import java.util.*;

public class Print100OuttheArrayElement {
	//Print Directly
	static void print() {
		int arr[]= {111,89,70,15,800,99};
		Scanner Sc=new Scanner(System.in);
		int num;
		System.out.print("Enter A Element:");
		num=Sc.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<num) {
				System.out.print(arr[i]+" ");
			}
		}
	}
	
	//using new array
	static void print1() {
		int arr[]= {111,89,70,15,800,99};
		Scanner Sc=new Scanner(System.in);
		int num;
		System.out.print("\nEnter A Element:");
		num=Sc.nextInt();
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<num) {
				count++;
			}
		}
		int store[]=new int[count];
		int j=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<num) {
				store[j]=arr[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(store));
	}
public static void main(String[] args) {
	print();
	print1();
}
}
