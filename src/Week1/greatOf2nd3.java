package Week1;

import java.util.Scanner;

public class greatOf2nd3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if(a>b && a>c) {
			System.out.println(a+" is the greatest");
		}
		else if(b>a && b>c) {
			System.out.println(b+" is the greatest");
		}
		else {
			System.out.println(c+" is the greatest");
		}
		sc.close();
		
	}

}