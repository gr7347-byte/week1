import java.util.Scanner;

class NaturalSumFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input
        int number = input.nextInt();

        if (number > 0) {
            // Compute using formula
            int formulaSum = number * (number + 1) / 2;

            // Compute using for loop
            int loopSum = 0;
            for (int counter = 1; counter <= number; counter++) {
                loopSum = loopSum + counter;
            }

            // Compare and print results
            System.out.println("Sum using formula = " + formulaSum);
            System.out.println("Sum using for loop = " + loopSum);
            System.out.println("Both results match: " + (formulaSum == loopSum));
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }

        input.close();
    }
}