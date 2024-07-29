public class prg11 {
    public static void main(String[] args) {
        // Define the numbers
        int[] numbers = {43, 54, 53, 75, 67, 89};

        // Calculate the sum of the numbers
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        // Calculate the average
        double average = (double) sum / numbers.length;

        // Check if the average is greater than 60
        if (average > 60) {
            System.out.println("The average of the numbers is greater than 60.");
        } else {
            System.out.println("The average of the numbers is not greater than 60.");
        }

        // Display the average
        System.out.println("The average is: " + average);
    }
}
