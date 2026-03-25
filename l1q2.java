import java.util.Scanner;

class SmallestChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get 3 input values
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        // Check if first number is the smallest
        boolean isSmallest = (number1 < number2) && (number1 < number3);
        System.out.println("Is the first number the smallest? " + isSmallest);

        input.close();
    }
}