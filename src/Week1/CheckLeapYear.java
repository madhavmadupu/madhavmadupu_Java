package Week1;
import java.util.Scanner;
public class CheckLeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Year:");
		int year=sc.nextInt();
		boolean isLeapYear = ((year%4==0 && year%100!=0) || (year%400 ==0));
		if(isLeapYear) {
			System.out.println("It is a leap year");
		}
		else {
			System.out.println("It is non leap year");
		}
		sc.close();
	}
}