
class Parent {
    int x = 10;

    Parent() {
        System.out.println("Parent constructor");
    }

    void show() {
        System.out.println("Parent show method");
    }
}

class Child extends Parent {
    int x = 20;

    Child(int x) {
        // this refers to current class variable
        this.x = x;

        // super refers to parent class constructor
        super.show();

        System.out.println("Child constructor");
    }

    void display() {
        // this.x → Child class variable
        System.out.println("Child x: " + this.x);

        // super.x → Parent class variable
        System.out.println("Parent x: " + super.x);
    }
}

public class Super {
    public static void main(String[] args) {
        Child obj = new Child(50);
        obj.display();
    }
}
