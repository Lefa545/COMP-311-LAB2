import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Question3 {
    public static void main(String[] args) {
       // Create a File object for the students.txt file
        File file = new File("students.txt");

        try {

            Scanner fileScanner = new Scanner(file);

            // Read each line from the file and process it
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();

                // Skip empty lines
                if (line.trim().isEmpty()) {
                    continue;
                }

                // Split the line into name and score using comma as the delimiter
                String[] parts = line.split(",");
                String name = parts[0].trim(); 
                String score = parts[1].trim();

                // Display the name and score in the specified format
                System.out.println("Name: " + name + " | Score: " + score);
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
        
            System.out.println("Error: students.txt was not found in this folder.");
        }
    }
}
