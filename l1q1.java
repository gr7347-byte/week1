import java.util.Scanner;

class DivisibleByFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input
        int number = input.nextInt();

        // Check divisibility and print result
        boolean isDivisible = (number % 5 == 0);
        System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);

        input.close();
    }
}