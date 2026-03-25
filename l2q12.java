import java.util.Scanner;

class PowerFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get number and power, validate positive integers
        int number = input.nextInt();
        int power = input.nextInt();

        if (number < 1 || power < 1) {
            System.out.println("Please enter positive integers for both number and power.");
        } else {
            // Multiply result by number, power times
            int result = 1;
            for (int i = 1; i <= power; i++) {
                result = result * number;
            }
            System.out.println(number + " ^ " + power + " = " + result);
        }
        input.close();
    }
}