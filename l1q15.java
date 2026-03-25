import java.util.Scanner;

class FactorialFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input
        int number = input.nextInt();

        if (number > 0) {
            // Compute factorial using for loop
            long factorial = 1;
            for (int counter = 1; counter <= number; counter++) {
                factorial = factorial * counter;
            }
            System.out.println("The factorial of " + number + " is " + factorial);
        } else {
            System.out.println("The number " + number + " is not a positive integer");
        }

        input.close();
    }
}