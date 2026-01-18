class AddFloatToDouble {

    // Function with float parameters
    static void getValues(float a, float b) {

        // Converting float to double in main logic
        double x = a;
        double y = b;

        double sum = x + y;

        System.out.println("Sum = " + sum);
    }

    public static void main(String[] args) {

        float num1 = 10.5f;
        float num2 = 20.3f;

        // Passing float variables to function
        getValues(num1, num2);
    }
}

