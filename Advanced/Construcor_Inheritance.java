package Advanced;

import org.w3c.dom.ls.LSOutput;

class base1 {
    base1(){
        System.out.println("Iam a base class constructor");
    }
    base1(int x){
        System.out.println("Iam an over loaded constructor with the value of: "+x);
    }
}
class Derived1 extends base1 {
    Derived1(){
        System.out.println("Iam the derived class constructor");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("Iam an overloaded constructor with the value of y is: "+y);
    }
}
class ChildOfDerived extends Derived1 {
    ChildOfDerived(){
        System.out.println("Iam the ChildOFDerived");
    }
    ChildOfDerived(int x, int y, int z){
        super(y,z);
        System.out.println("Iam the overloaded constructor with the value of z is:"+z);
    }
}
public class Construcor_Inheritance {
    public static void main(String[] args) {
//        base1 b = new base1(3);
//        Derived1 d = new Derived1(2,4);
        ChildOfDerived c = new ChildOfDerived(12,23,12);
    }
}
