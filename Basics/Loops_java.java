package Basics;

public class Loops_java {
    public static void main(String[] args) {
        // while loop | do while loop |
//        int i = 100;
//        while (i<=200){
//            System.out.println(i);
//            i++;
//        }
//        System.out.println(
//                "this is a next loop "
//        );
//        while (i>20){
//            System.out.println(i);
//            i--;
//        }
//        System.out.println("End of the while loop");
       //   | do while loop, it does not check the condition before entering the loop
//        int b = 0;
//        do {
//            System.out.println(b);
//            b++;
//        }while(b<5);
//
        // For loop
//        for(int i=0; i<=10; i++){
//            System.out.println(i);
//        }
        // best for number calculation, iterating, specific number of times
        // even numbers 2n = 0 2 4 6 8
        // odd numbers 2n+1 =1 3 5 7 9
        int n = 1000;
        for(int i = 0; i<=n; i++){
            System.out.println(2*i+1);
        }
        // decrementing for loop
        for (int i = 100 ; i!=0; i--){
            System.out.println(i);

        }


    }
}
