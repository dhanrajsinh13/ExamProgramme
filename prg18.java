import java.util.Scanner;

public class prg18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println("The sum of all even numbers between 1 and " + n + " is: " + sum);
    }
}


//Question: Write a program to find the sum of all even numbers between 1 to n.