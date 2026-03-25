import java.util.Scanner;

class FactorialWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input
        int number = input.nextInt();

        if (number > 0) {
            // Compute factorial using while loop
            long factorial = 1;
            int counter = 1;
            while (counter <= number) {
                factorial = factorial * counter;
                counter++;
            }
            System.out.println("The factorial of " + number + " is " + factorial);
        } else {
            System.out.println("The number " + number + " is not a positive integer");
        }

        input.close();
    }
}