import java.util.Scanner;

public class prg13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter marks for 4 subjects
        System.out.print("Enter marks for subject 1: ");
        int subject1 = scanner.nextInt();

        System.out.print("Enter marks for subject 2: ");
        int subject2 = scanner.nextInt();

        System.out.print("Enter marks for subject 3: ");
        int subject3 = scanner.nextInt();

        System.out.print("Enter marks for subject 4: ");
        int subject4 = scanner.nextInt();

        // Calculate the total marks
        int totalMarks = subject1 + subject2 + subject3 + subject4;

        // Calculate the percentage
        double percentage = (double) totalMarks / 4;

        // Determine the grade based on the percentage
        char grade;
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display the results
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        // Close the scanner
        scanner.close();
    }
}


//Question: Write a program to input marks of a student in 4 subjects and compute total, percentage and grade.