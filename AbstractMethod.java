abstract class animal{
    abstract void sound();
    void eat(){
        System.out.println("This animal eats food");
    }
}
class Dog extends animal{
    void sound(){
        System.out.println("Dog barks");
    }
}
public class AbstractMethod {
    public static void main(String[] args) {
        animal Animal = new Dog();
        Animal.sound();
        Animal.eat();
    }
}