class employee{
    int id;
    String name;
    public void printing_details(){
        System.out.println("My id is "+id);
        System.out.println("My name is "+name);
    }
}
public class OOps_java {
    public static void main(String[] args){
        employee nawaz = new employee();
        employee john = new employee();
        System.out.println("This is our custom class: ");
        // objects
        nawaz.id = 23;
        nawaz.name = "Syed";
        john.id = 23;
        john.name = "John";
//        System.out.println(nawaz.id);
//        System.out.println(nawaz.name);
        nawaz.printing_details();
        john.printing_details();
    }
}
