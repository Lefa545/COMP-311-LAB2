import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        File inputFile = new File("numbers.txt");

        int evenCount = 0;
        int oddCount = 0;

        try {
            Scanner fileScanner = new Scanner(inputFile);

            while (fileScanner.hasNextInt()) {
                int number = fileScanner.nextInt();

                // Check if the number is even or odd and update the respective count
                if (number % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }

            fileScanner.close();

            // Write the even and odd counts to a file named evenodd.txt
            FileWriter writer = new FileWriter("evenodd.txt");
            writer.write("Even count: " + evenCount + System.lineSeparator());
            writer.write("Odd count: " + oddCount + System.lineSeparator());
            writer.close();

            // Print a message indicating that the even and odd counts have been written to the file
            System.out.println("Even/odd counts written to evenodd.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error: numbers.txt was not found in this folder.");
        } catch (IOException e) {
            System.out.println("Error writing to evenodd.txt: " + e.getMessage());
        }
    }
}