// Parent class
class Parent {
    String surname = "Kataria";

    void showSurname() {
        System.out.println("Surname: " + surname);
    }
}

// Child class inheriting Parent class
class Child extends Parent {

    String name = "Mishty";

    void showName() {
        System.out.println("Name: " + name);
    }
}

// Main class
class InheritanceDemo {
    public static void main(String[] args) {

        Child obj = new Child();

        // Accessing parent class property
        obj.showSurname();

        // Accessing child class property
        obj.showName();
    }
}
