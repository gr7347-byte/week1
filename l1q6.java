import java.util.Scanner;

class NumberSignChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get number input
        int number = input.nextInt();

        // Check sign of the number
        if (number > 0) {
            System.out.println(number + " is positive");
        } else if (number < 0) {
            System.out.println(number + " is negative");
        } else {
            System.out.println(number + " is zero");
        }

        input.close();
    }
}