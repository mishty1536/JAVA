public class Student1 {
    int rollNo;
    String name;
    
    // Static variable (common for all students)
    static String college = "SIT College";

    // Constructor
    Student1(int r, String n) {
        rollNo = r;
        name = n;
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("College: " + college);
        System.out.println();
    }

    public static void main(String[] args) {
        Student1 s1 = new Student1(101, "Mishty");
        Student1 s2 = new Student1(102, "Riya");

        s1.display();
        s2.display();
    }
}
