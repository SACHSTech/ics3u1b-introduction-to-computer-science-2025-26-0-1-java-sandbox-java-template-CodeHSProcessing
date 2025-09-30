import processing.core.PApplet;

/**
 * Entry point for ICS3U assignments using Processing graphics.
 *
 * Instructions:
 *   - Write ALL of your code inside the setup() and draw() methods below.
 *   - DO NOT change the main() method. It is required to start your sketch.
 *   - If you need extra methods, add them at the very bottom of this file.
 *
 * This file sets up the Processing framework.
 *
 * @author Your Name
 */
public class Sketch extends PApplet {

    /**
     * Standard Java entry point for Processing.
     * Do not edit this method.
     */
    public static void main(String[] args) {
        PApplet.main("Sketch"); // Leave this alone — it runs your sketch
    }

    /**
     * The settings() method runs before setup().
     * Use this to set the canvas size.
     */
    @Override
    public void settings() {
        size(600, 600);   // Set the canvas size
    }

    /**
     * The setup() method runs once at the beginning of the program.
     * Place any one-time setup code here.
     */
    @Override
    public void setup() {
        // === START WRITING YOUR CODE BELOW THIS LINE ===

        background(200);  // Fill the background with grey

        // === END OF YOUR CODE ===
    }

    /**
     * The draw() method repeats about 60 times per second after setup().
     * Use this for animation or continuous drawing.
     * Leave empty if not needed.
     */
    @Override
    public void draw() {
        // === START WRITING YOUR CODE BELOW THIS LINE ===

        fill(0);                 // Set fill colour to black
        ellipse(300, 300, 200, 200);  // Draw a circle at the centre

        // === END OF YOUR CODE ===
    }

    // === EXTRA METHODS BELOW (optional) ===
    // If you want to make your own helper methods, add them here.
    // Example: void drawCircle(int x, int y, int r) { ellipse(x, y, r, r); }

    // === END OF EXTRA METHODS ===
}
