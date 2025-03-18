import java.io.PrintStream;

public class String_methods {
    public static void main(String[] args) {
        String name = "Nawaz";
       // int value = name.length();
        System.out.println(name);

        /*
        System.out.println("Lower case value is ");
        String lstring = name.toLowerCase();
        System.out.println(lstring);
        System.out.println("upper case value");
        System.out.println(name.toUpperCase());
        System.out.println(name.substring(3));
        System.out.println(name.substring(1,4));
        System.out.println(name.replace('a','u'));
        System.out.println(name.replace("a","Ind"));
        */
       // System.out.println(name.startsWith("ma"));
       // System.out.println(name.endsWith("az"));
        /*
        System.out.print(name.charAt(0));
        System.out.print(name.charAt(1));
        System.out.print(name.charAt(2));
        System.out.print(name.charAt(3));
        System.out.print(name.charAt(4));
        */
        System.out.println(name.indexOf("z",3));
        System.out.println("iam escape sequence \" \\  \n \t double code");


    }
}
