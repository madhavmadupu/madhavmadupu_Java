package Week1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,i,val=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		num = sc.nextInt();
		for(i=1;i<=num;i++) {
			val=val*i;
		}
		System.out.println("Factorial of "+num+" is "+val);
		sc.close();
	}

}