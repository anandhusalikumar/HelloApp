/**
 * HelloApp UC1-UC3: Display "Hello World" or Personalized Greeting with Default Handling
 *
 * UC1: Display "Hello World"
 * UC2: Accept a name as command-line argument and display "Hello, [name]!"
 * UC3: Display "Hello" with Command-Line Argument or Default Message using ternary operator
 *
 * Description:
 * The app accepts a user's name as a command-line argument and displays a personalized greeting.
 * If no name is provided, it defaults to "World". This use case combines the basic functionality
 * from UC1 with the personalization from UC2, adding robustness through default handling.
 *
 * @author Anandhu Salikumar
 * @version 3.0.0
 */
public class HelloApp {

    /**
     * Main method - Entry point for the application
     *
     * This method serves as the entry point for program execution.
     * It reads command-line arguments and displays a personalized greeting.
     * Uses ternary operator for concise conditional assignment.
     *
     * Usage:
     * java HelloApp                 - Displays "Hello, World!"
     * java HelloApp John            - Displays "Hello, John!"
     * java HelloApp Alice Bob       - Displays "Hello, Alice!" (uses first argument)
     *
     * @param args Command-line arguments containing the user's name
     */
    public static void main(String[] args) {
        // Use ternary operator to assign name based on argument availability
        String name = (args.length > 0) ? args[0] : "World";

        // Display the personalized greeting
        System.out.println("Hello, " + name + "!");
    }
}
