/* @author Krish Aravind
 * @version 4.0
 * @since UC4
 */
public class uc4 {
    public static void main(String[] args) {
        // Check if the array is empty
        if (args.length > 0) {
            // Iterate through each argument provided
            for (String name : args) {
                if (name != null && !name.isEmpty()) {
                    System.out.println("Hello " + name + "!");
                }
            }
        } else {
            // Default case if no arguments are passed
            System.out.println("Hello World!");
        }
    }
}