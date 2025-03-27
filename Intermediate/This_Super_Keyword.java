package Intermediate;

// Parent class
class Parent {
    String message = "Hello from Parent class";

    Parent() {
        System.out.println("Parent class constructor called");
    }

    void displayMessage() {
        System.out.println(message);
    }
}

// Child class
class Child extends Parent {
    String message = "Hello from Child class";

    Child() {
        // Call the Parent class constructor using super()
        super();
        System.out.println("Child class constructor called");
    }

    void showMessages() {
        System.out.println("Using this: " + this.message);  // Refers to Child class variable
        System.out.println("Using super: " + super.message); // Refers to Parent class variable
    }

    void callParentMethod() {
        super.displayMessage(); // Calls Parent class method
    }
}

// Main


public class This_Super_Keyword {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.showMessages();
        obj.callParentMethod();
    }
}
