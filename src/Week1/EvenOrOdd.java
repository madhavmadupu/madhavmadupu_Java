package Week1;
import java.util.*;

public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check: \n");
		int num = sc.nextInt();
		if(num%2==0) {
			System.out.println("The number is Even.");
		}
		else {
			System.out.println("The number is Odd.");
		}
	}
}
