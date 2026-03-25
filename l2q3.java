import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the number for the multiplication table
        int number = input.nextInt();

        // Print table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }
        input.close();
    }
}