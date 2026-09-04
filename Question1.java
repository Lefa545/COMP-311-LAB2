import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            // Prompt the user to enter a numeric score
            System.out.print("Enter a numeric score between 0 to 100: ");

            // Read the numeric score from the user
            if (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a numeric score.");
                return;
            }

            double score = scanner.nextDouble();
// Validate the score to ensure it is within the valid range
            if (score < 0 || score > 100) {
                System.out.println("Invalid score. Please enter a score between 0 and 100.");
                return;
            }
 char grade;
// Determine the letter grade based on the numeric score
            if (score >= 80) {
                grade = 'A';
            } else if (score >= 70) {
                grade = 'B';
            } else if (score >= 60) {
                grade = 'C';
            } else if (score >= 50) {
                grade = 'D';
            } else {
                grade = 'F';
            }
// Display the letter grade
            System.out.println("Letter grade: " + grade);
        }
    }
}