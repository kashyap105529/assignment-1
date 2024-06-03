package assignment;

import java.util.Scanner;

public class ReversString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        // Reverse the string and print in lowercase
        String reversedString = reverseString(inputString);
        System.out.println("Reversed string: " + reversedString.toLowerCase());
        
        scanner.close();
    }
    
    // Method to reverse a string
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
