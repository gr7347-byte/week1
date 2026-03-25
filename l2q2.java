import java.util.Scanner;

class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get salary and years of service
        double salary = input.nextDouble();
        int yearsOfService = input.nextInt();

        // Calculate bonus: 5% if years of service > 5, else no bonus
        double bonusAmount = 0;
        if (yearsOfService > 5) {
            bonusAmount = salary * 0.05;
            System.out.println("Bonus Amount: " + bonusAmount);
        } else {
            System.out.println("No bonus. Years of service must be more than 5.");
        }
        input.close();
    }
}