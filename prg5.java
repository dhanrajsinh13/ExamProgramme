import java.util.Scanner;

public class prg5{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your score: ");
        double score = scanner.nextDouble();

        if (score > 80 && score < 90) {
            score += 5;
        }        
    
        System.out.println("Score after adjustment: " + score);
        
    scanner.close();
    }
}


//Question: Suppose that score is a variable of type double. Write the java statement that increases the score by 5 marks if the score is between 80 and 90.

