import java.util.Scanner;

class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Initialize total
        double total = 0.0;

        // Infinite loop - breaks when user enters 0 or negative
        while (true) {
            double userEntry = input.nextDouble();

            if (userEntry <= 0) {
                break;
            }

            total = total + userEntry;
        }

        System.out.println("The total sum is " + total);

        input.close();
    }
}