import java.util.Scanner;

class SumUntilZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Initialize total and get first user input
        double total = 0.0;
        double userEntry = input.nextDouble();

        // Keep adding until user enters 0
        while (userEntry != 0) {
            total = total + userEntry;
            userEntry = input.nextDouble();
        }

        System.out.println("The total sum is " + total);

        input.close();
    }
}