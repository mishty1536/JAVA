public class MethodOverloading {

    // Method with two integer parameters
    void add(int a, int b) {
        System.out.println("Sum of integers = " + (a + b));
    }

    // Method with two double parameters
    void add(double a, double b) {
        System.out.println("Sum of doubles = " + (a + b));
    }

    public static void main(String[] args) {

        MethodOverloading obj = new MethodOverloading();

        // Calling overloaded methods
        obj.add(10, 20);        // calls add(int, int)
        obj.add(10.5, 20.3);    // calls add(double, double)
    }
}
