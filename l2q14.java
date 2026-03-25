import java.util.Scanner;

class PowerWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get number and power
        int number = input.nextInt();
        int power = input.nextInt();

        // Use counter to track iterations
        int result = 1;
        int counter = 0;
        while (counter < power) {
            result = result * number;
            counter++;
        }

        System.out.println(number + " ^ " + power + " = " + result);
        input.close();
    }
}