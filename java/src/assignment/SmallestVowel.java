package assignment;

import java.util.Scanner;

public class SmallestVowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        // Find and print the smallest vowel
        char smallestVowel = findSmallestVowel(inputString);
        System.out.println("Smallest vowel: " + smallestVowel);
        
        scanner.close();
    }
    
    // Method to find the smallest vowel in a string
    public static char findSmallestVowel(String str) {
        char smallestVowel = 'z'; // Initialize with 'z' as it is greater than any vowel
        
        for (char ch : str.toCharArray()) {
            if (isVowel(ch) && ch < smallestVowel) {
                smallestVowel = ch;
            }
        }
        
        return smallestVowel;
    }
    
    // Method to check if a character is a vowel
    public static boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }
}
