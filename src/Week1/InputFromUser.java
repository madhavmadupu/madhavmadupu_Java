package Week1;

import java.util.Scanner;

public class InputFromUser {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("What is ur name user?");
        String name=sc.nextLine();
        System.out.println("Hello, "+name);
        sc.close();
    }
}
