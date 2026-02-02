abstract class shape{
    abstract void draw();
    void message(){
        System.out.println("This is a shape");
    }
}
class circle extends shape{
    void draw(){
        System.out.println("Drawing a circle");
    }
}
public class AbstractExample {
    public static void main(String[] args) {
        shape s = new circle();
        s.draw();
        s.message();
    }
}