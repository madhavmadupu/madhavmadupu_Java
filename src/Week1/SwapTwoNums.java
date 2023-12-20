package Week1;
import java.util.Scanner;

public class SwapTwoNums {
    void swap(int x,int y){
        int temp=x;
        x=y;
        y=temp;
        System.out.println("Value of x: "+x+"\nValue of y: "+y);
    }

    public static void main(String[] args){
        int x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st integer: ");
        x=sc.nextInt();
        System.out.println("Enter 2nd integer: ");;
        y=sc.nextInt();
        SwapTwoNums sw = new SwapTwoNums();
        sw.swap(x, y);
        sc.close();
    }
}
