package Basics;

import java.util.Scanner;
public class input_in_java {
    public static void main(String[] args) {
        System.out.println("taking input from the user");
        Scanner input = new Scanner (System.in);
        System.out.println("Enter first Number");
        int a = input.nextInt();
        System.out.println("enter next number");
        int b = input.nextInt();
        int sum = a+b;
        System.out.println("the sum of this numbers is "+sum);
    }
}
