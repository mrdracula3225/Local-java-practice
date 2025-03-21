package Intermediate;

public class Varargs_java {
    public static int add(int ...arr){
        int result = 0;
        for(int a:arr){
            result += a;
        }
        return result;
    }
    public static int gun(int a, int b){
        int sum;
        sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("The value of 3 and 5 is: "+add(3,4));
        System.out.println("The value of 9 and 10 is: "+add(9,10));
        int c = gun(2,2);
        System.out.println("The value of 2 plus 2 is: "+c);


    }
}
