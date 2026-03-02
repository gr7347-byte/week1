import java.util.Scanner;

class SwapNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number 1: ");
        int number1 = input.nextInt(); // [cite: 122]
        System.out.print("Enter Number 2: ");
        int number2 = input.nextInt(); // [cite: 123]

        int temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println("The swapped numbers are " + number1 + " and " + number2);
    }
}