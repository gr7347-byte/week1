import java.util.Scanner;

class FizzBuzzWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input and validate positive integer
        int number = input.nextInt();

        if (number < 1) {
            System.out.println("Please enter a positive integer.");
        } else {
            // While loop FizzBuzz
            int i = 1;
            while (i <= number) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
                i++;
            }
        }
        input.close();
    }
}