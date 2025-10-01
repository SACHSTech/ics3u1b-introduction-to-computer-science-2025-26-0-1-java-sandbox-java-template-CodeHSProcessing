/**
 * Entry point for ICS3U assignments with console output.
 *
 * Instructions: 
 *   - Write all your code inside the run() method below.
 *   - DO NOT change the main() method. It is needed to start your program.
 *
 * @author Your Name
 */
public class Main extends ConsoleProgram {

    /**
     * The run() method is your "workspace."
     * Place all assignment code here.
     */
    @Override
    public void run() {
        // === START WRITING YOUR CODE BELOW THIS LINE ===

        // Example program: prompt user and print greeting
        String name = readLine("Enter your name: ");
        System.out.println("Hello, " + name + "!");

        // === END OF YOUR CODE ===
    }

    /**
     * Standard Java entry point.
     * Do not edit this method.
     */
    public static void main(String[] args) {
        new Main().run(); // Leave this alone — it runs your program
    }
}
