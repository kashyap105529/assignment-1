package assignment;
import java.util.Scanner;

public class VowelConsonentCounter {

    public static void main(String[] args) {
        // Define vowels
        String vowels = "AEIOUaeiou";
        
        // Read input string from the user
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = s.nextLine();
        
        // Initialize counters
        int vowelCount = 0;
        int consonantCount = 0;
        
        // Iterate through each character in the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            // Check if it's a vowel
            if (vowels.indexOf(ch) != -1) {
            	vowelCount++;
            } else {
                // If it's not a vowel, it must be a consonant
                consonantCount++;
                }
            }
        
        // Print the results
        System.out.println("Vowels count - " + vowelCount);
        System.out.println("Consonants count - " + consonantCount);
    }
}
