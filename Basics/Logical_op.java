package Basics;

public class Logical_op {
    public static void main(String[] args) {
        System.out.println("For Logical and.....");
        boolean a = false;
        boolean b = true;
        if (a && b) {
            System.out.println("y");
        } else {
            System.out.println("N");
        }
        System.out.println("for logical or.....");
        boolean a1 = false;
        boolean b1 = false;
        if (a1 || b1) {
            System.out.println("y");
        } else {
            System.out.println("N");
        }
        System.out.println("For logical not.....");
        System.out.println("NOT(A) ->");
        System.out.println(!a);
        System.out.println("NOT(B) ->");
        System.out.println(!b);

    }
}
