package Tempo;

import java.util.Scanner;

public class insert_at_spec {

	public static void main(String[] args) {
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of the Static array");
		n=sc.nextInt();
		int[] a=new int[n];
		int[] na=new int[n+1];
		System.out.println("Enter elements:");
		for (i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the element & position:");
		int el=sc.nextInt();
		int pos=sc.nextInt();
		
		for(i=0;i<n+1;i++) {
			if(i<pos-1) {
				na[i]=a[i];		
			}
			else if(i==pos-1) {
				na[i]=el;
			}
			else {
				na[i]=a[i-1];
			}
		}
		System.out.println("The elements are");
		for(i=0;i<n+1;i++) {
			System.out.print(na[i]+" ");
		}
	}
}
