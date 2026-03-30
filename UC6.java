public class UC6 {
    public static void main(String[] args) {

        // If no arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        String result = "";

        // Enhanced for loop
        for (String name : args) {
            result += name + ", ";
        }

        // Remove trailing ", "
        result = result.substring(0, result.length() - 2);

        // Print greeting
        System.out.println("Hello, " + result + "!");
    }
}