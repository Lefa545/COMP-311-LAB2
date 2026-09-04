import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        File inputFile = new File("students.txt");

        try {
           
            // Create a Scanner to read from the input file and a FileWriter to write to the output file
            Scanner fileScanner = new Scanner(inputFile);
            FileWriter writer = new FileWriter("grades.txt");

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                if (line.trim().isEmpty()) {
                    continue;
                }

                // Split the line into name and score using comma as the delimiter
                String[] parts = line.split(",");
                String name = parts[0].trim();
                int score = Integer.parseInt(parts[1].trim());

                // Determine the letter grade based on the numeric score
                char grade;
                if (score >= 80 && score <= 100) {
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
                // Write the name, score, and grade to the output file in the format: name,score,grade
                writer.write(name + "," + score + "," + grade + System.lineSeparator());
            }
         fileScanner.close();
            writer.close();
            System.out.println("Grade report written to grades.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error: students.txt was not found in this folder.");
        } catch (IOException e) {
            System.out.println("Error writing to grades.txt: " + e.getMessage());
        }
    }
}
