import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Question9 {
    public static void main(String[] args) {
        File inputFile = new File("numbers.txt");
 
        // Initialize variables to track the positive and negative sums and counts
        long positiveSum = 0;  
        long negativeSum = 0;
        int positiveCount = 0;
        int negativeCount = 0;

        try {
            Scanner fileScanner = new Scanner(inputFile);

            // Read each integer from the file and update the positive and negative sums and counts accordingly.
            while (fileScanner.hasNextInt()) {
                int number = fileScanner.nextInt();

                if (number > 0) {
                    positiveSum += number;
                    positiveCount++;
                } else if (number < 0) {
                    negativeSum += number;
                    negativeCount++;
                }
                
            }

            fileScanner.close();

            // Write the positive and negative totals to a file named signs.txt
            FileWriter writer = new FileWriter("signs.txt");
            writer.write("Positive total: " + positiveSum + " (" + positiveCount + " numbers)" + System.lineSeparator());
            writer.write("Negative total: " + negativeSum + " (" + negativeCount + " numbers)" + System.lineSeparator());
            writer.close();

            // Print a message indicating that the totals have been written to the file.
            System.out.println("Totals written to signs.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error: numbers.txt was not found in this folder.");
        } catch (IOException e) {
            System.out.println("Error writing to signs.txt: " + e.getMessage());
        }
    }
}
