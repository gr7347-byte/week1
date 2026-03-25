import java.util.Scanner;

class PrimeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get number input from user
        int number = input.nextInt();

        // Prime check only valid for numbers greater than 1
        boolean isPrime = number > 1;

        // Loop from 2 to number-1 to check divisibility
        for (int i = 2; i < number; i++) {
            // If remainder is 0, number is divisible by i - not prime
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        // Display result
        if (isPrime) {
            System.out.println(number + " is a Prime Number");
        } else {
            System.out.println(number + " is not a Prime Number");
        }

        input.close();
    }
}