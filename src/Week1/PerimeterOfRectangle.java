package Week1;

import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args){
        int l;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Length of Rectangle: ");
        l = sc.nextInt();
        System.out.println("Breath of Rectangle: ");
        b = sc.nextInt();
        System.out.println("Perimeter of the rectangle is: "+(2*(l+b)));
        sc.close();
    }
}
