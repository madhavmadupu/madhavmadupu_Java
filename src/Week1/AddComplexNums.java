package Week1;
import java.util.*;

public class AddComplexNums {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the real 1");
		int real1 = sc.nextInt();
		System.out.println("Enter the imaginary 1");
		int img1 = sc.nextInt();
		System.out.println("Enter the real 2");
		int real2 = sc.nextInt();
		System.out.println("Enter the imaginary 2");
		int img2 = sc.nextInt();
		int real_sum = real1 + real2;
		int img_sum = img1 + img2;
		System.out.println("Finam Imaginary Number is "+real_sum+"+"+img_sum+"i");
		sc.close();	
	}
}
