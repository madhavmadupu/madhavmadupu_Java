package Tempo;

import java.util.Scanner;

public class min_and_max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int min,max;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of the Static array");
		n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter elements:");
		for (int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		max=a[0];
		for (int i=0;i<n;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max+" is the greatest");
		
		min=a[0];
		for (int i=0;i<n;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println(min+" is the smallest");
	}
}