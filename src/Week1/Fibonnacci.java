package Week1;

import java.util.Scanner;

public class Fibonnacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int a=0;
		int b=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("fibonacci series range");
		n=sc.nextInt();
		for (int i=1;i<n;i++) {
			System.out.print(a + " ");
			int c=a+b;
			a=b;
			b=c;
			
		}
	}

}