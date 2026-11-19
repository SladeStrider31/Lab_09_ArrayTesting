import java.util.Random;

public class ArrayTesting {

    public static void main(String[] args) {

        // Create array with 50 elements
        int[] dataPoints = new int[50];

        // Create Random object
        Random rnd = new Random();

        // Fill array with random numbers from 1 to 50
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(50) + 1;
        }

        // Display array values separated by " | "
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);

            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }

        System.out.println();

        // Calculate sum
        int sum = 0;

        for (int i = 0; i < dataPoints.length; i++) {
            sum += dataPoints[i];
        }

        // Calculate average
        double average = (double) sum / dataPoints.length;

        // Display results
        System.out.println("The sum of the random array dataPoints is: " + sum);
        System.out.printf("The average of the random array dataPoints is: %.2f%n", average);
    }
}