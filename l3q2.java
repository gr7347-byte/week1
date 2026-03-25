import java.util.Scanner;

// Program 2 - Leap Year with single if condition
class LeapYearSingle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get year input from user
        int year = input.nextInt();

        // Single if condition using && and || operators
        if (year >= 1582 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
        }

        input.close();
    }
}