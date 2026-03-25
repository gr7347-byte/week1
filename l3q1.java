import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get year input from user
        int year = input.nextInt();

        // Check if year is valid for Gregorian calendar
        if (year < 1582) {
            System.out.println(year + " is not valid (Gregorian calendar starts from 1582)");
        } else if (year % 400 == 0) {
            System.out.println(year + " is a Leap Year");
        } else if (year % 100 == 0) {
            System.out.println(year + " is not a Leap Year");
        } else if (year % 4 == 0) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
        }

        input.close();
    }
}