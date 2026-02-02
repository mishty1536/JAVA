//In java there is no multiple inheritance it is called dimond problem and its solution is interface 
//inheritance maa jetlu mangyu hase ej lese akhu parent class nai le 
//abstract class akhu parent class lese koi particular block of code nai le 
interface Animal{
    void sound();
}
class Dog implements Animal{
    public void sound(){
        System.out.println("Dog barks");
    }
}
public class interfaceExample {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
    }
}
