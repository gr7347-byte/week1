import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get two number inputs and operator from user
        double first = input.nextDouble();
        double second = input.nextDouble();
        String op = input.next();

        double result = 0;

        // Perform operation based on operator using switch-case
        switch (op) {
            case "+":
                result = first + second;
                System.out.println(first + " + " + second + " = " + result);
                break;
            case "-":
                result = first - second;
                System.out.println(first + " - " + second + " = " + result);
                break;
            case "*":
                result = first * second;
                System.out.println(first + " * " + second + " = " + result);
                break;
            case "/":
                result = first / second;
                System.out.println(first + " / " + second + " = " + result);
                break;
            default:
                System.out.println("Invalid Operator");
        }

        input.close();
    }
}