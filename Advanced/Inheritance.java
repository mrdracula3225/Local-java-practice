package Advanced;
class Base {
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("Ima in base ");
        this.x = x;
    }

    public void PrintME() {

    }
}

    class Derived extends Base {
        int Y;

         public int getY() {
             return Y;
         }

         public void setY(int y) {
             Y = y;
         }
     }

public class Inheritance {
    public static void main(String[] args) {
        Base b = new Base();
        b.setX(2);
        System.out.println(b.getX());
        Derived  d = new Derived();
        d.setY(3);
        System.out.println(d.getY());



    }
}
