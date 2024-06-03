package assignment;

import java.util.Scanner;

public class SmallVowel {

    public static void main(String[] args) {
        // Define vowels
        String vowels = "aeiou";
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = s.nextLine().toLowerCase();
        char smallestVowel = Character.MAX_VALUE;
        boolean foundVowel = false;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (vowels.indexOf(ch) != -1) {
 
                if (ch < smallestVowel) {
                    smallestVowel = ch;
                    foundVowel = true;
                }
            }
        }
        
        if (foundVowel) {
            System.out.println("The smallest vowel is: " + smallestVowel);
        } else {
            System.out.println("No vowels found in the input string.");
        }
    }
}
