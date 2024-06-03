package assignment;

import java.util.Scanner;

public class ReverserNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Reverse the number using solution 1
        int reversedNumber1 = reverseNumberSolution1(number);
        System.out.println("Solution 1 - Reversed number: " + reversedNumber1);
        
        // Reverse the number using solution 2
        int reversedNumber2 = reverseNumberSolution2(number);
        System.out.println("Solution 2 - Reversed number: " + reversedNumber2);
        
        scanner.close();
    }
    
    public static int reverseNumberSolution1(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return reversedNumber;
    }
    
    public static int reverseNumberSolution2(int number) {
        StringBuilder sb = new StringBuilder(String.valueOf(number));
        sb.reverse();
        return Integer.parseInt(sb.toString());
    }
}