import java.util.Scanner;

class MultiplesFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get number and validate: positive integer less than 100
        int number = input.nextInt();

        if (number < 1 || number >= 100) {
            System.out.println("Please enter a positive integer less than 100.");
        } else {
            System.out.println("Multiples of " + number + " below 100:");
            // Loop backward from 100 to 1
            for (int i = 100; i >= 1; i--) {
                if (i % number == 0) {
                    System.out.println(i);
                }
            }
        }
        input.close();
    }
}