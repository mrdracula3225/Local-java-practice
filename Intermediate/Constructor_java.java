package Intermediate;

class mynewemployee{
    private int id;
    private String name;


    public void setname (String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setId(int n ){
        id = n;
    }
    public int getid(){
        return id;
    }
    //    public Intermediate.mynewemployee(){
//        id = 23;
//        name = "Nawaz";
//    }
    public mynewemployee(String myname, int myid){
        id = myid;
        name = myname;
    }

}
public class Constructor_java {
    public static void main(String[] args) {
    mynewemployee nawaz = new mynewemployee("nawaz",23);
        System.out.println(nawaz.getid());
        System.out.println(nawaz.getName());

    }
}
