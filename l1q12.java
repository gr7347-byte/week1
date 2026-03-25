import java.util.Scanner;

class NaturalSumWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input
        int number = input.nextInt();

        if (number > 0) {
            // Compute using formula
            int formulaSum = number * (number + 1) / 2;

            // Compute using while loop
            int loopSum = 0;
            int counter = 1;
            while (counter <= number) {
                loopSum = loopSum + counter;
                counter++;
            }

            // Compare and print results
            System.out.println("Sum using formula  = " + formulaSum);
            System.out.println("Sum using while loop = " + loopSum);
            System.out.println("Both results match: " + (formulaSum == loopSum));
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }

        input.close();
    }
}