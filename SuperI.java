class Parent {
    int salary = 30000;

    void show() {
        System.out.println("Parent class salary: " + salary);
    }
}

class Child extends Parent {
    int salary = 50000;

    void display() {
        // Access parent class variable
        System.out.println("Parent salary using super: " + super.salary);

        // Access parent class method
        super.show();
    }
}

public class SuperI {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}
