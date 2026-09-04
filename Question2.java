import java.util.Scanner;


public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    // Prompt the user to enter their full name    
        System.out.print("Enter your full name: ");
         String fullName = scanner.nextLine();

         // Prompt the user to enter a letter to check if their name starts with it
         System.out.print("Enter a letter to check if your name starts with it: ");
     String letterInput = scanner.nextLine();

     // Count the total number of characters in a full name including spaces.
        int totalCharacters = fullName.length();

       // Convert the full name to uppercase.
        String upperCase = fullName.toUpperCase();

        // Convert the full name to lowercase.
    String lowerCase = fullName.toLowerCase();

    // Check if the full name starts with the specified letter.
         boolean startsWithLetter = false;
        if (!letterInput.isEmpty() && !fullName.isEmpty()) {
            char letter = Character.toLowerCase(letterInput.charAt(0));
            char firstChar = Character.toLowerCase(fullName.charAt(0));
            startsWithLetter = (letter == firstChar);
        }

        // Display the results.
        System.out.println("Total number of characters (including spaces): " + totalCharacters);
        System.out.println("Uppercase: " + upperCase);
        System.out.println("Lowercase: " + lowerCase);
        System.out.println("Starts with '" + letterInput + "': " + startsWithLetter);

        scanner.close();
    }
}