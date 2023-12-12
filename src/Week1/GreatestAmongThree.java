package Week1;

import java.util.Scanner;

public class GreatestAmongThree {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first integer: ");
        int a=sc.nextInt();
        System.out.println("Enter the second integer: ");
        int b=sc.nextInt();
        System.out.println("Enter the third integer: ");
        int c=sc.nextInt();
        if(a>b && a>c){
            System.out.println(a+" is the Greatest.");
        }
        else if(b>a && b>c){
            System.out.println(b+" is the Greatest.");
        }
        else if(c>a && c>b){
            System.out.println(c+" is the Greatest.");
        }
        else{
            System.out.println("All the values are Equal.");
        }
        sc.close();
    }
}
