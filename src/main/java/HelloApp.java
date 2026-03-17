/**
 * HelloApp UC1-UC4: Display "Hello World", Single Name, Multiple Names, or Default Message
 *
 * UC1: Display "Hello World"
 * UC2: Accept a name as command-line argument and display "Hello, [name]!"
 * UC3: Display "Hello" with Command-Line Argument or Default Message using ternary operator
 * UC4: Display "Hello" with Multiple Command-Line Arguments or Default Message
 *
 * Description:
 * The app accepts multiple names as command-line arguments and displays a personalized greeting
 * for all names. If no names are provided, it defaults to "World". This use case extends the
 * functionality of UC3 by allowing for multiple inputs and demonstrating how to handle arrays
 * of arguments efficiently using String.join().
 *
 * @author Anandhu Salikumar
 * @version 4.0.0
 */
public class HelloApp {

    /**
     * Main method - Entry point for the application
     *
     * This method serves as the entry point for program execution.
     * It reads command-line arguments and displays a personalized greeting for all names.
     * Uses String.join() to efficiently combine multiple names with comma and space delimiter.
     *
     * Usage:
     * java HelloApp                      - Displays "Hello, World!"
     * java HelloApp John                 - Displays "Hello, John!"
     * java HelloApp Alice Bob            - Displays "Hello, Alice, Bob!"
     * java HelloApp Alice Bob Charlie    - Displays "Hello, Alice, Bob, Charlie!"
     *
     * @param args Command-line arguments containing the user's names
     */
    public static void main(String[] args) {
        // Use String.join() to efficiently combine all names with ", " delimiter
        // If no arguments provided, use "World" as default
        String names = (args.length > 0) ? String.join(", ", args) : "World";

        // Display the personalized greeting with all names
        System.out.println("Hello, " + names + "!");
    }
}
