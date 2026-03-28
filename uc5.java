/**
 * @author Krish Aravind
 * @version 5.0
 * @since UC5
 */
public class uc5 {
    public static void main(String[] args) {
        // Condition to handle the empty arguments case
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // UC5: Using Enhanced For Loop (for-each)
            for (String name : args) {
                // Ensure we don't process null or empty strings if passed
                if (name != null && !name.trim().isEmpty()) {
                    System.out.println("Hello, " + name + "!");
                }
            }
        }
    }
}