import java.util.Scanner;

class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get marks for 3 subjects
        double physicsMark = input.nextDouble();
        double chemistryMark = input.nextDouble();
        double mathsMark = input.nextDouble();

        // Calculate average percentage
        double averageMark = (physicsMark + chemistryMark + mathsMark) / 3;

        // Determine grade and remarks based on percentage
        String grade;
        String remarks;

        if (averageMark >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } else if (averageMark >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (averageMark >= 60) {
            grade = "C";
            remarks = "Level 2, below but approaching agency-normalized standards";
        } else if (averageMark >= 50) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } else if (averageMark >= 40) {
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }

        // Display results
        System.out.println("Average Mark: " + averageMark + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        input.close();
    }
}