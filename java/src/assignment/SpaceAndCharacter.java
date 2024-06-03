package assignment;

import java.util.Scanner;

public class SpaceAndCharacter {

    public static void main(String[] args) {
        // Read input string from the user
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = s.nextLine();
        
        // Initialize counters
        int spaceCount = 0;
        int characterCount = 0;
        
        // Iterate through each character in the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            
            // Check if the character is a space
            if (ch == ' ') {
                spaceCount++;
            }
            // Check if the character is a letter
            else if (Character.isLetter(ch)) {
                characterCount++;
            }
            // Ignore digits and other characters
        }
        
        // Print the results
        System.out.println("No of spaces: " + spaceCount + " and characters: " + characterCount);
    }
}
