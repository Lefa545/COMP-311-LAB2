import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Question7 {
    public static void main(String[] args) {
        File inputFile = new File("numbers.txt");

    
        // Initialize variables to track the smallest, largest, sum, and count of numbers
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        long sum = 0; 
        int count = 0;

        try {
            Scanner fileScanner = new Scanner(inputFile);

            // Read each integer from the file and update the smallest, largest, sum, and count accordingly
            while (fileScanner.hasNextInt()) {
                int number = fileScanner.nextInt();

                if (number < smallest) {
                    smallest = number;
                }
                if (number > largest) {
                    largest = number;
                }
                sum += number;
                count++;
            }
            fileScanner.close();

            double average = (count == 0) ? 0 : (double) sum / count;

            // Write the statistics to a file named stats.txt
            FileWriter writer = new FileWriter("stats.txt");
            writer.write("Smallest: " + smallest + System.lineSeparator());
            writer.write("Largest: " + largest + System.lineSeparator());
            writer.write("Average: " + average + System.lineSeparator());
            writer.close();

            // Print a message indicating that the statistics have been written to the file
            System.out.println("Statistics written to stats.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error: numbers.txt was not found in this folder.");
        } catch (IOException e) {
            System.out.println("Error writing to stats.txt: " + e.getMessage());
        }
    }
}
