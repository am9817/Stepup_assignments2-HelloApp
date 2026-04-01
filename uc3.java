
public class uc3 {
    public static void main(String[] args) {
        String name = "World";
        if (args.length > 0 && args[0] != null && !args[0].isEmpty()) {
            name = args[0];
        }
        System.out.println("Hello " + name + "!");
    }
}

