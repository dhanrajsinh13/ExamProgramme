import java.util.Scanner;

public class prg3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Calculate the area of a rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        double areaRectangle = length * width;
        System.out.println("The area of the rectangle is: " + areaRectangle);

        // Calculate the area of a square
        System.out.print("Enter the side length of the square: ");
        double side = scanner.nextDouble();
        double areaSquare = side * side;
        System.out.println("The area of the square is: " + areaSquare);

        // Calculate the area of a triangle
        System.out.print("Enter the base length of the triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();
        double areaTriangle = 0.5 * base * height;
        System.out.println("The area of the triangle is: " + areaTriangle);

        // Close the scanner
        scanner.close();
    }
}

//Question: Write a java program to find areas of different shapes like rectangle, square and triangle. Read the required input, apply formula and then display the area.


