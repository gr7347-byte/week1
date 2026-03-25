import java.util.Scanner;

class AbundantChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get number input from user
        int number = input.nextInt();
        int sum = 0;

        // Loop from 1 to number-1 to find all divisors
        for (int i = 1; i < number; i++) {
            // If i divides number evenly, it is a divisor
            if (number % i == 0) {
                sum += i;
            }
        }

        // Check if sum of divisors exceeds the number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number (sum of divisors = " + sum + ")");
        } else {
            System.out.println(number + " is not an Abundant Number (sum of divisors = " + sum + ")");
        }

        input.close();
    }
}