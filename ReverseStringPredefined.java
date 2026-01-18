class ReverseStringPredefined {
    public static void main(String[] args) {

        String name = "Mishty";

        String reversed = new StringBuilder(name).reverse().toString();

        System.out.println("Reversed String: " + reversed);
    }
}

