class prg1{
 public static void main(String[] args) {
    
    int x=10;
    int y=5;
    
    int sum = x + y;
    int difference = x - y;
    int product = x * y;
    double quotient = (double) x / y; // Cast to double for accurate division
    double average = (x + y) / 2.0; // Cast to double for accurate average calculation

    // Display the results
    System.out.println("Addition of x and y: " + sum);
    System.out.println("Subtraction of x and y: " + difference);
    System.out.println("Multiplication of x and y: " + product);
    System.out.println("Division of x by y: " + quotient);
    System.out.println("Average of x and y: " + average);
}
} 


//Question: Write a program to show the results of addition, subtraction, multiplication, division, and average of two variables x=10 and y=5.

