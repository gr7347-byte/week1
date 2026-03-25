import java.util.Scanner;

class RocketCountdownFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get countdown start value
        int startValue = input.nextInt();

        // Count down from startValue to 1 using for loop
        for (int counter = startValue; counter >= 1; counter--) {
            System.out.println(counter);
        }
        System.out.println("Blast off!");

        input.close();
    }
}