
public class uc6 {
    public static void main(String[] args) {
        // Handle the default case
        if (args == null || args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Initialize a String to hold our names
        String greeting = "Hello, ";
        
        // UC6: Enhanced for loop to aggregate names
        for (String name : args) {
            if (name != null && !name.trim().isEmpty()) {
                greeting += name + ", ";
            }
        }

        // UC6: Remove the trailing comma and space using substring
        // The length of ", " is 2 characters
        if (greeting.endsWith(", ")) {
            greeting = greeting.substring(0, greeting.length() - 2);
        }

        // Add the final punctuation
        System.out.println(greeting + "!");
    }
}
