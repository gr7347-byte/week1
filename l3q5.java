import java.util.Scanner;

class ArmstrongChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get number input and store original value
        int number = input.nextInt();
        int originalNumber = number;
        int sum = 0;

        // Loop through each digit until originalNumber is 0
        while (originalNumber != 0) {
            // Find last digit using modulus
            int digit = originalNumber % 10;

            // Add cube of digit to sum
            sum += digit * digit * digit;

            // Remove last digit using integer division
            originalNumber = originalNumber / 10;
        }

        // Check if sum equals original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number");
        } else {
            System.out.println(number + " is not an Armstrong Number");
        }

        input.close();
    }
}