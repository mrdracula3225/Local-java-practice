package Intermediate;

public class Method_Overloading {
    //    static void Jokes(){
//
//        System.out.println("HEllO World ");
//    }
//    static void change1(int a ){
//        a = 89;
//    }
//
//    static void change2(int [] arr){
//       arr[0]=95;
//    }
    static void mr() {
        System.out.println("Hello bro!");
    }

    static void mr(int a) {
        System.out.println("Hello " +a+ "bro!");
    }
    static void mr (int a , int b ) {
        System.out.println("hello "+a+" bro no : "+b);
    }

        public static void main (String[] args) {
            mr();
            mr(2000);
            mr(2300,4);
//       Jokes();
//
//       int x = 45;
//       change1(x);
//        System.out.println("The value of the integer after changing : "+ x );
//
//        int [] marks = {12,34,12,14,43,13,};
//        change2(marks);
//        System.out.println("The value of the array after changing the 0 position :"+marks[0]);

    }
}