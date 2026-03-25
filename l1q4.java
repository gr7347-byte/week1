import java.util.Scanner;

class NaturalNumberSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input
        int number = input.nextInt();

        // Check if number is a natural number (positive integer)
        if (number > 0) {
            int sumOfNaturalNumbers = number * (number + 1) / 2;
            System.out.println("The sum of " + number + " natural numbers is " + sumOfNaturalNumbers);
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }

        input.close();
    }
}