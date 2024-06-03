package assignment;

import java.util.Scanner;

public class SpaceChar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:");
        String input = scanner.nextLine();
        
        int spaces = 0;
        int characters = 0;
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                characters++;
            } else if (Character.isWhitespace(ch)) {
                spaces++;
            }
        }
        
        System.out.println("No of spaces : " + spaces + " and characters : " + characters);
        
        scanner.close();
    }
}
