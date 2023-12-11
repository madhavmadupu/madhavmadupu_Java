package Week2;
import java.util.*;

public class MinValue {
	int a,b,c, min;
	int minValue(int a, int b, int c) {
		if(a<b && a<c) {
			min=a;
		}
		if(b<a && b<c) {
			min=b;
		}
		if(c<a && c<b) {
			min=c;
		}
		return min;
	}
	
	public static void main(String[] args) {
		MinValue mv=new MinValue();
		Scanner sc=new Scanner(System.in);
		int x = mv.minValue(sc.nextInt(), sc.nextInt(), sc.nextInt());
		System.out.print("The minimum value is "+x);
	}
}