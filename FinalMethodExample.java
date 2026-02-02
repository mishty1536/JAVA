class parent{
    final void display(){
        System.out.println("Final method in parent class");
    }
}
class Child extends parent{
    //void display()
}
public class FinalMethodExample {
    public static void main(String[] args) {
        Child C = new Child();
        C.display();
    }
}