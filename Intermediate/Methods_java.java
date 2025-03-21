package Intermediate;

public class Methods_java {
    // if not static access modifier is default
     static int logic (int x, int y) {
        int z;
        if (x>y){
            z=x+y;
        }
        else {
            z = (x+y) * 5;
        }
        return z;
    }
    public static void main(String[] args) {
         // method invocation using object
        //Intermediate.Methods_java obj = new Intermediate.Methods_java();
        // c = obj.logic(a,b);
        int a = 3;
        int b = 2;
        int c = logic(a,b);
        System.out.println(c);

        int a1 = 6;
        int b1 = 5;
        int c1 = logic(a1,b1);
        System.out.println(c1);

        int p = 2903;
        int q = 345;
        int r = logic(p,q);
        System.out.println(r);



    }
}
