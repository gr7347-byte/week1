import java.util.Scanner;

class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get number input
        int number = input.nextInt();
        int greatestFactor = 1;

        // Use counter starting at number-1 going down to 1
        int counter = number - 1;
        while (counter >= 1) {
            if (number % counter == 0) {
                greatestFactor = counter;
                break;
            }
            counter--;
        }

        System.out.println("Greatest factor of " + number + " (excluding itself): " + greatestFactor);
        input.close();
    }
}