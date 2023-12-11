package Tempo;

import java.util.Scanner;

public class cube_of_number {
	int n;
	cube_of_number(int n, int pow){
		double result=Math.pow(n,pow);
		System.out.println(result+" is the cube of the number");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number");
		int num=sc.nextInt();
		int pow=sc.nextInt();
		cube_of_number c= new cube_of_number(num, pow);
	}
}