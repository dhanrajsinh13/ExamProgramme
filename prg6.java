import java.util.Scanner;

public class prg6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read three numbers from the user
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        // Find the maximum number
        double max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }

        // Find the minimum number
        double min = num1;
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }

        // Display the results
        System.out.println("The maximum number is: " + max);
        System.out.println("The minimum number is: " + min);

        // Close the scanner
        scanner.close();
    }
}

//Question: Write a program to find maximum and minimum between three numbers.

