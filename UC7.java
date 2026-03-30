public class UC7 {
    public static void main(String[] args) {

        // If no arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Join names using String.join()
        String names = String.join(", ", args);

        // Print greeting
        System.out.println("Hello, " + names + "!");
    }
}