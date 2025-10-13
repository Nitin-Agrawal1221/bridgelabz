import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {
        int limit = 50;

        Function<String, Integer> getLength = msg -> msg.length();

        String message = "This is a simple message to check the character limit.";

        int length = getLength.apply(message);

        if (length > limit) {
            System.out.println(" Message exceeds the character limit!");
        } else {
            System.out.println(" Message is within the limit.");
        }

        System.out.println("Message length: " + length);
    }
}
