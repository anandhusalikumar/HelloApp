/**
 * HelloApp UC1-UC2: Display "Hello World" or Personalized Greeting
 * 
 * UC1: Display "Hello World"
 * UC2: Accept a name as command-line argument and display "Hello, [name]!"
 * 
 * Description:
 * The app displays a greeting message. In UC1, it displays "Hello World".
 * In UC2, it accepts a user's name as a command-line argument and displays
 * a personalized greeting. If no name is provided, it defaults to "World".
 * 
 * @author Anandhu Salikumar
 * @version 2.0.0
 */
public class HelloApp {
    
    /**
     * Main method - Entry point for the application
     * 
     * This method serves as the entry point for program execution.
     * It reads command-line arguments and displays a personalized greeting.
     * 
     * Usage:
     * java HelloApp                 - Displays "Hello, World!"
     * java HelloApp John            - Displays "Hello, John!"
     * java HelloApp Alice Bob       - Displays "Hello, Alice!" (uses first argument)
     * 
     * @param args Command-line arguments containing the user's name
     */
    public static void main(String[] args) {
        // Check if command-line arguments were provided
        if (args.length > 0) {
            // Use the first argument as the name
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        } else {
            // Default greeting if no arguments provided
            System.out.println("Hello, World!");
        }
    }
}
