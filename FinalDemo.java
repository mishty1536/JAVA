// Program to demonstrate final class, final method, and final variable

// Final Class (cannot be inherited)
final class Demo {

    // Final Variable (constant value)
    final int number = 100;

    // Final Method (cannot be overridden)
    final void display() {
        System.out.println("This is a final method.");
        System.out.println("Final variable value: " + number);
    }
}

public class FinalDemo{
    public static void main(String[] args) {

        // Creating object of final class
        Demo obj = new Demo();

        // Calling final method
        obj.display();
    }
}

