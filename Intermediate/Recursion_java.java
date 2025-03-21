package Intermediate;

import java.util.Scanner;
public class Recursion_java {
    static int factorial(int n){
        if (n==0 || n==1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }
    static int factorial_iterative(int n){
        if (n==0 || n==1){
            return 1;
        }
        else{
            int product = 1;
            for (int i=1;i<=n;i++){
                product *= i;
            }
            return product;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
         int n = a;
        System.out.println("The factorial of given number is "+factorial(n));
        System.out.println("The factorial of given number using iterative approach is "+factorial_iterative(n));
    }
}
