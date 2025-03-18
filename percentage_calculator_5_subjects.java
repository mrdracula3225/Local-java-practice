import java.util.Scanner;
public class percentage_calculator_5_subjects {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("What is the total maximum marks");
        float total = sc.nextInt();
        System.out.println("Enter the marks of first subject ");
        float a = sc.nextInt();
        System.out.println("Enter the second sub marks");
        float b = sc.nextInt();
        System.out.println("Enter the third sub marks");
        float c = sc.nextInt();
        System.out.println("Enter the fourth sub marks");
        float d = sc.nextInt();
        System.out.println("Enter the fifth sub marks");
        float e = sc.nextInt();
        float sum = a+b+c+d+e;
        float percentage = sum /total;
        System.out.println("total percentage is "+percentage);


    }
}
