import java.util.Scanner;

class HarshadChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get number input from user
        int number = input.nextInt();
        int originalNumber = number;
        int sum = 0;

        // Loop to compute sum of all digits
        while (number != 0) {
            // Extract last digit
            int digit = number % 10;
            sum += digit;
            // Remove last digit
            number = number / 10;
        }

        // Check if original number is perfectly divisible by digit sum
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number (digit sum = " + sum + ")");
        } else {
            System.out.println(originalNumber + " is not a Harshad Number (digit sum = " + sum + ")");
        }

        input.close();
    }
}