import java.util.Scanner;

class FactorsFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get number and validate positive integer
        int number = input.nextInt();

        if (number < 1) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Factors of " + number + ":");
            // Check each value from 1 to number-1
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }
        input.close();
    }
}