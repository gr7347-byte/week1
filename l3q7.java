import java.util.Scanner;

class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get weight in kg and height in cm
        double weightKg = input.nextDouble();
        double heightCm = input.nextDouble();

        // Convert height from cm to meters
        double heightM = heightCm / 100;

        // Calculate BMI using formula: weight / (height * height)
        double bmi = weightKg / (heightM * heightM);

        // Determine weight status based on BMI value
        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Display BMI and status
        System.out.println("BMI: " + bmi);
        System.out.println("Status: " + status);

        input.close();
    }
}