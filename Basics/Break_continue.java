package Basics;

public class Break_continue {
    public static void main(String[] args) {
        // break and continue using loops!
//        for(int i=0; i<=10; i++){
//            System.out.println(i);
//            System.out.println("Java is great");
//            if(i==5){
//                System.out.println("Ending the loop");
//                break;
//            }
//            int i=0;
//            while(i<5){
//                System.out.println(i);
//                System.out.println("Exiting the loop");
//                i++;
//                if(i==3){
//                    break;
//            }

//        int i=0;
//        do {
//            System.out.println(i);
//            System.out.println("Java is great");
//            i++;
//            if (i == 5) {
//                break;
//            }
//        } while (i < 10);

        for(int i=0; i<=10; i++){
            if(i==2){
                System.out.println("Iam the test for continue statement");
                continue;
            }
            System.out.println("Hello");
            System.out.println(i);
        }
    }
}
