package Tempo;

import java.util.Scanner;

public class even_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of the Static array");
		n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter elements:");
		for (int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("The even elements at even index are:");
		for (int i=0;i<n;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]+" ");
			}
			i++;
		}
	sc.close();
	}
}

