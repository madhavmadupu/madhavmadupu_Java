
package Tempo;

import java.util.Scanner;

public class large_and_small {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int min=0,max=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of the Static array");
		n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter elements:");
		for (int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("The greatest and smallest element in the array are:");
		for (int i=0;i<n;i++) {
			if(a[i]>max) {
				max=a[i];
				System.out.println(a[i]+" is the greatest");
			}
			if(a[i]<min) {
				min=a[i];
				System.out.println(a[i]+" is the smallest");
			}	
		}
	}
}