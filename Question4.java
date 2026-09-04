import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arrays to hold the five names and five scores as we collect them
        String[] names = new String[5];
        int[] scores = new int[5];

        // Collect five names and five scores from the user
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter name for student " + (i + 1) + ": ");
            names[i] = scanner.nextLine();

            System.out.print("Enter score for student " + (i + 1) + ": ");
            scores[i] = Integer.parseInt(scanner.nextLine());
        }

       // Write the names and scores to a file named results.txt
        try {
            FileWriter writer = new FileWriter("results.txt");

            for (int i = 0; i < 5; i++) {
                // Write each name and score to the file in the format: name,score
                writer.write(names[i] + "," + scores[i] + System.lineSeparator());
            }
            
            writer.close(); 
            System.out.println("Results written to results.txt");
        } catch (IOException e) {
            System.out.println("Error writing to results.txt: " + e.getMessage());
        }

        scanner.close();
    }
}
