import java.util.Scanner;

class FactorsWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get number and validate positive integer
        int number = input.nextInt();

        if (number < 1) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Factors of " + number + ":");
            // Use counter to iterate and find factors
            int counter = 1;
            while (counter < number) {
                if (number % counter == 0) {
                    System.out.println(counter);
                }
                counter++;
            }
        }
        input.close();
    }
}