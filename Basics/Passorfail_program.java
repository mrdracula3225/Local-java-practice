package Basics;

import java.util.Scanner;
public class Passorfail_program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your total percentage");
//        float total = sc.nextFloat();
//        if (total<40){
//            System.out.println("you are a Failure");
//        }
//        else{
//            System.out.println("you have passed");
//        }
        // float = a, b, c;
        System.out.println("Enter The marks of first subject");
        float a = sc.nextFloat();
        System.out.println("Enter the marks of second subject");
        float b = sc.nextFloat();
        System.out.println("Enter the marks of third subject");
        float c = sc.nextFloat();
        float avg = (a+b+c)/3.0f;
        System.out.println("Your over all percentage is: "+avg);
        if (avg>=40 && a>=33 && b>=33 && c>=33) {
            System.out.println("congrats You have passed");
        }
        else{
            System.out.println("You are a Failure!");
        }


    }
}
