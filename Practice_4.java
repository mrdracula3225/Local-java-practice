import java.util.Scanner;
public class Practice_4 {
    public static void main(String[] args) {
        // problem 1
        float[] a = {10.1f, 20.1f, 10.1f, 20.1f, 10.1f};
//        float sum = 0;
//        // for each loop
//        for(float element:a){
//            sum = sum + element;
//
//        }
//        System.out.println("the sum is:"+sum);
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value to be checked: ");
//        float b = sc.nextFloat();
//        // problem 2
//        float b = 10.11f;
//        boolean isinarray = false;
//        for(float element:a) {
//            if (b == element) {
//                isinarray = true;
//                break;
//            }
//        }
//        if (isinarray){
//            System.out.println("The element is present in the array");
//        }
//        else{
//            System.out.println("The element is not present in the array");
//        }
        float avg = 0;
        for (float element:a){
            avg = avg+element;
        }
        float avg1 = avg/a.length;
        System.out.println(avg1);

    }
}
