/*
  Promotion, Casting, and Overloading Program
  Devin Riley
  11/08/2026
 */

public class MultiUse {

    public static void main(String[] args) {

        // Testing with one parameter.
        System.out.println("=== multiUse(int): print numbers from 1 to n ===");
        multiUse(5);

        double decimalValue = 7.9;
        System.out.println("\nCasting " + decimalValue + " to int gives " + (int) decimalValue + ":");
        multiUse((int) decimalValue);

        System.out.println("\nCalling multiUse(0):");
        multiUse(0);


        // Testing with two parameters.
        System.out.println("\n=== multiUse(double, double): average of two numbers ===");

        // Java converts integers to doubles.
        double averageOfInts = multiUse(7, 10);
        System.out.println("Average of 7 and 10 (ints promoted to double): " + averageOfInts);

        double averageOfDoubles = multiUse(4.5, 9.25);
        System.out.println("Average of 4.5 and 9.25: " + averageOfDoubles);

        // Casting to int removes the decimal portion.
        System.out.println("Average of 7 and 10 cast to int: " + (int) averageOfInts);


        // Testing with three parameters.
        System.out.println("\n=== multiUse(double, double, double): maximum of three numbers ===");

        double maxOfInts = multiUse(12, 45, 30);
        System.out.println("Maximum of 12, 45, 30: " + maxOfInts);


        // Testing with different number types.
        double maxOfMixed = multiUse(3, 5.5, 8L);
        System.out.println("Maximum of 3, 5.5, 8L (mixed types): " + maxOfMixed);

        double maxOfNegatives = multiUse(-2.5, -8.0, -1.75);
        System.out.println("Maximum of -2.5, -8.0, -1.75: " + maxOfNegatives);
    }

    // Prints numbers from 1 up to the given limit.
    public static void multiUse(int limit) {
        if (limit < 1) {
            System.out.println("No numbers to print (value must be at least 1).");
            return;
        }

        for (int i = 1; i <= limit; i++) {
            System.out.print(i);
            if (i < limit) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    // Returns average of two numbers.
    public static double multiUse(double first, double second) {
        return (first + second) / 2.0;
    }

    // Returns largest of three numbers.
    public static double multiUse(double first, double second, double third) {
        double maximum = first;

        if (second > maximum) {
            maximum = second;
        }
        if (third > maximum) {
            maximum = third;
        }

        return maximum;
    }
}
