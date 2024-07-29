public class prg17 {
    public static void main(String[] args) {
        System.out.println("Even numbers between 1 and 100:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\nOdd numbers between 1 and 100:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}


//Question: Write a java program to print all even and odd numbers between 1 to 100.