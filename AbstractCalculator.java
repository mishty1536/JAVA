import java.util.Scanner;

// Abstract Class
abstract class Calculator {

    abstract void add(int a, int b);
    abstract void subtract(int a, int b);
    abstract void multiply(int a, int b);
    abstract void divide(int a, int b);
}

// Child Class
class SimpleCalculator extends Calculator {

    void add(int a, int b) {
        System.out.println("Addition = " + (a + b));
    }

    void subtract(int a, int b) {
        System.out.println("Subtraction = " + (a - b));
    }

    void multiply(int a, int b) {
        System.out.println("Multiplication = " + (a * b));
    }

    void divide(int a, int b) {
        if (b != 0)
            System.out.println("Division = " + (a / b));
        else
            System.out.println("Cannot divide by zero!");
    }
}

// Main Class
public class AbstractCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Calculator calc = new SimpleCalculator();

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("\n1.Add  2.Subtract  3.Multiply  4.Divide");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                calc.add(num1, num2);
                break;
            case 2:
                calc.subtract(num1, num2);
                break;
            case 3:
                calc.multiply(num1, num2);
                break;
            case 4:
                calc.divide(num1, num2);
                break;
            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
