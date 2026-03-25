import java.util.Scanner;

class FizzBuzzFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input and validate positive integer
        int number = input.nextInt();

        if (number < 1) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Loop and apply FizzBuzz rules
            for (int i = 1; i <= number; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        }
        input.close();
    }
}