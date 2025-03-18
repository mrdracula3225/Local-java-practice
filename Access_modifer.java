class myemployee{
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

}
public class Access_modifer {
    public static void main(String[] args) {
        myemployee nawaz = new myemployee();
        nawaz.setId(23);
        nawaz.setname("NAWaZ");
        System.out.println(nawaz.getid());
        System.out.println(nawaz.getName());

    }
}
