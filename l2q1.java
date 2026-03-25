import java.util.Scanner;

class OddEvenPrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input and validate natural number
        int number = input.nextInt();

        if (number < 1) {
            System.out.println("Please enter a natural number (>= 1)");
        } else {
            // Loop from 1 to number and classify each as odd or even
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is Even");
                } else {
                    System.out.println(i + " is Odd");
                }
            }
        }
        input.close();
    }
}