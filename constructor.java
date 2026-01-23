class Student {
    String name;
    int age;

    // default Constructor
    /*Student() {
        name = "Mishty";
        age = 18;
    }*/

    // parameterized constructor
    Student(String n, int a){
        name = n;
        age = a;
    }

    // Method to display values
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class constructor{
    public static void main(String[] args) {

        //Student student1 = new Student();
        Student student1 = new Student("Mishty",19);
        student1.display();
    }
}
