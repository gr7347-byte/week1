import java.util.Scanner;

class MultiplesWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get number and validate: positive integer less than 100
        int number = input.nextInt();

        if (number < 1 || number >= 100) {
            System.out.println("Please enter a positive integer less than 100.");
        } else {
            System.out.println("Multiples of " + number + " below 100:");
            // Use counter starting at 99 and going down
            int counter = 99;
            while (counter >= 1) {
                if (counter % number == 0) {
                    System.out.println(counter);
                }
                counter--;
            }
        }
        input.close();
    }
}