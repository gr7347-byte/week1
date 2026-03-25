import java.util.Scanner;

class GreatestFactorFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get number input
        int number = input.nextInt();
        int greatestFactor = 1;

        // Loop from number-1 down to 1 to find greatest factor
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }

        System.out.println("Greatest factor of " + number + " (excluding itself): " + greatestFactor);
        input.close();
    }
}