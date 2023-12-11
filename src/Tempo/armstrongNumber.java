package Tempo;

import java.util.Scanner;

public class armstrongNumber {
	int number;
	
	int isArmstrong() {
		int orginalNumber=number;
		int sum=0;
		
		while(number>0) {
			int digit =number % 10;
			sum+=Math.pow(digit, 3);
			number/=10;
		}
		if(sum==orginalNumber) {
			return 1;
		}
		else {
			return 0;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int num=sc.nextInt();
		armstrongNumber a= new armstrongNumber();
		a.number=num;
		int result=a.isArmstrong();
		if(result==1) {
			System.out.println(num+" is a armstrong number");
		}
		else{
			System.out.println(num+" is not a armstrong number");
		}
	}

}

