package Advanced;
class Phone {
    public void ShowingTime(){
        System.out.println("Time is 8 AM ");
    }
    public void on(){
        System.out.println("Turning on the smart phone...");
    }
}
class SmartPhone extends Phone{
    public void Music(){
        System.out.println("Playing music....");
    }
    public void on(){
        System.out.println("turning on smartphone....");
    }
}

public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {
         Phone obj = new SmartPhone(); // Allowed
        obj.on();
        obj.ShowingTime();
       // obj.Music(); // Not Allowed
    }
}
