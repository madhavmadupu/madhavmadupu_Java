package Tempo;
import java.util.Scanner;

class great{
	int a;
	int b;
	int c;
	great(int a, int b, int c){
		if(a>b && a>c) {
			System.out.println(a+" is the greates");
		}
		if(b>c && b>a) {
			System.out.println(b+" is the greates");
		}
		if(c>a && c>b) {
			System.out.println(c+" is the greates");
		}
	}
}

public class method_great_small {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		great obj=new great(a,b,c);
	}
}