import java.util.Scanner;

class LargestChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get 3 input values
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        // Check if each number is the largest
        boolean isFirstLargest = (number1 >= number2) && (number1 >= number3);
        boolean isSecondLargest = (number2 >= number1) && (number2 >= number3);
        boolean isThirdLargest = (number3 >= number1) && (number3 >= number2);

        System.out.println("Is the first number the largest? " + isFirstLargest);
        System.out.println("Is the second number the largest? " + isSecondLargest);
        System.out.println("Is the third number the largest? " + isThirdLargest);

        input.close();
    }
}