// Interface 1
interface Parent1 {
    default void show() {
        System.out.println("Show from Parent1");
    }
}

// Interface 2
interface Parent2 {
    default void show() {
        System.out.println("Show from Parent2");
    }
}

// Child class implements both interfaces
class Child implements Parent1, Parent2 {

    // Overriding is compulsory to resolve ambiguity
    public void show() {
        System.out.println("Diamond Problem Solved in Child Class");
        
        // Calling Parent1 method explicitly
        Parent1.super.show();

        // Calling Parent2 method explicitly
        Parent2.super.show();
    }
}

// Main class
public class dimondProblem{
    public static void main(String[] args) {

        Child obj = new Child();
        obj.show();
    }
}

