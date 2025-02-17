import java.util.Scanner;

/**
 * The MathOperators program implements an application that
 * performs basic math operations including addition, subtraction,
 * multiplication, division, exponents, and square roots.
 *
 * <p>This class demonstrates proper JavaDoc formatting and usage of
 * various math operations.</p>
 *
 * @author Val I
 * @version 1.0
 * @since 2025-02-11
 */
public final class TryCatch {

    /**
     * This is a private constructor to satisfy style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private TryCatch() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * This is the main method.
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        // Greets user
        System.out.println("Hello and Welcome to my program");
        System.out.print("I will be helping you calculate the");
        System.out.println(" volume of a sphere in meters.");
        System.out.println("Enter the radius of your sphere");

        // Creates Scanner
        final Scanner scanner = new Scanner(System.in);

        try {
            // Get radius from user as a string
            final String radString = scanner.nextLine();

            // Convert string to a double
            final double radDouble = Double.parseDouble(radString);

            // If radius is negative, inform the user
            if (radDouble < 0) {
                System.out.println("Radius cannot be negative.");
            } else {
                // Calculate the volume of the sphere
                final double volumeHalf = Math.PI * Math.pow(radDouble, 3);
                final double volume = volumeHalf * (4.0 / 3.0);

                // Display the volume rounded to 2 decimal places
                System.out.print("The volume of a sphere with a radius of ");
                System.out.print(radString + "m is ");
                System.out.format("%.2f", volume);
                System.out.println(" m^3");
            }
        } catch (NumberFormatException ex) {
            // Handle invalid input errors
            System.out.println("Invalid input. Please enter a number.");
        }

        // Closes Scanner
        scanner.close();
    }
}
