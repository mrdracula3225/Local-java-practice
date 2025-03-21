package Basics;

import java.util.Scanner;
public class Switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("PIck a number below and enter your choice");
        System.out.println("age = 20, 40, 80, 90");
        int age = sc.nextInt();
        // switch case can work with strings, char, int etc..
        switch (age) {
            case 20 -> {
                System.out.println(1);
                System.out.println("You Kinda old ");
                System.out.println("YOu kinda old! ");
            }
            case 40 -> System.out.println("Give some time to your family bro !");
            case 80 -> System.out.println("You are literally cooked!");
            default -> System.out.println("enjoy the time you have left");
        }
        System.out.println("thanks for using java program");




        /*
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if (age>60){
            System.out.println("You are expericened");
        }
        else if(age>50){
            System.out.println("you are semi Experienced");
        }
        else if(age>30){
            System.out.println("you are not that expericenced ");
        }
        else{
            System.out.println("you are not experienced");
        }
        */

    }
}
