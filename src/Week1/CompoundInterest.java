package Week1;
import java.util.*;

public class CompoundInterest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p=sc.nextInt();
		int r=sc.nextInt();
		int n=sc.nextInt();
		System.out.println("The amount would be: "+Math.pow(p*(1+(r/100)), n));
		sc.close();
	}
}