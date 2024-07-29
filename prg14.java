import java.util.Scanner;

public class prg14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the value of n
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Print all natural numbers from 1 to n
        System.out.println("Natural numbers from 1 to " + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        // Close the scanner
        scanner.close();
    }
}


//Question: Write a java program to print all natural numbers from 1 to n

