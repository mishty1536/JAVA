final class FinalClass {
    void display(){
        System.out.println("This is final class");
    }
}
public class FinalClassExample {
    public static void main(String[] args) {
        FinalClass FC = new FinalClass();
        FC.display();
    }
}