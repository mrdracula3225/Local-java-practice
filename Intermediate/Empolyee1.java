package Intermediate;

// problem 1
class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }

}
class CellPhone{
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void ring(){
        System.out.println("Ringing...");
    }
}
class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perameter(){
        return 4*side;
    }
}
class Rectangle {
    int length;
    int width;
    public int area(){
        return length*width;
    }
    public int parameter(){
        return 2*(length+width);
    }
}
class Tommy{
    public void hit(){
        System.out.println("Hitting..");
    }
    public void run(){
        System.out.println("Running..");
    }
    public void fire(){
        System.out.println("Firing..");
    }

}
class Circle{
    float pi = 3.14f;
    float radius;

    public float area (){
        return pi*(radius*radius);
    }
    public float paremeter(){
        return 2*pi*radius;
    }
}
public class Empolyee1 {
    public static void main(String[] args) {
        // problem 1

        /*

        Intermediate.Employee nawaz = new Intermediate.Employee();
        nawaz.setName("Code Synth ml ");
        System.out.println(nawaz.getName());
        nawaz.salary = 10000;
        System.out.println(nawaz.getSalary());

        // problem 2

        Intermediate.CellPhone vivo = new Intermediate.CellPhone();
        vivo.ring();
        vivo.vibrate();

        // problem 3

        Intermediate.Square sq = new Intermediate.Square();
        sq.side = 4;
        System.out.println(sq.area());
        System.out.println(sq.perameter());

         problem 4

        Intermediate.Rectangle rc = new Intermediate.Rectangle();
        rc.length = 3;
        rc.width = 5;
        System.out.println(rc.area());
        System.out.println(rc.parameter());

        problem 5

        Intermediate.Tommy player = new Intermediate.Tommy();
        player.fire();
        player.run();
        player.hit();

         */
        //problem 6
//        Intermediate.Circle c = new Intermediate.Circle();
//        c.radius = 3;
//        System.out.println(c.area());
//        System.out.println(c.paremeter());



    }
}
