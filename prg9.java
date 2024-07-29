import java.util.Scanner;

public class prg9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calculate the factorial
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        // Display the factorial
        System.out.println("The factorial of " + number + " is " + factorial);

        // Close the scanner
        scanner.close();
    }
}
