class ReverseStringManual {
    public static void main(String[] args) {

        String name = "Mishty";
        String reversed = "";

        for(int i = name.length() - 1; i >= 0; i--) {
            reversed = reversed + name.charAt(i);
        }

        System.out.println("Reversed String: " + reversed);
    }
}
