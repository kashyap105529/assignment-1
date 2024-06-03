package assignment;

import java.util.Scanner;

public class LastChar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string:");
        String input = scanner.nextLine();

        String output = getLastCharacters(input);

        System.out.println("Output:");
        System.out.println(output);

        scanner.close();
    }

    public static String getLastCharacters(String input) {
        StringBuilder result = new StringBuilder();

        String[] words = input.split("\\s+");

        for (String word : words) {
            String cleanedWord = word.replaceAll("\\d", "");
            char lastChar = cleanedWord.charAt(cleanedWord.length() - 1);
            result.append(lastChar);
        }

        return result.toString();
    }
}