import java.util.Scanner;

class DigitCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get number input from user
        int number = input.nextInt();
        int originalNumber = number;

        // Initialize count to zero
        int count = 0;

        // Loop until number becomes 0
        while (number != 0) {
            // Remove last digit
            number = number / 10;
            // Increment count for each digit removed
            count++;
        }

        // Display the digit count
        System.out.println("Number of digits in " + originalNumber + " = " + count);

        input.close();
    }
}