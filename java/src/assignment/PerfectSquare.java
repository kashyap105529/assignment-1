package assignment;

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Check if the number is a perfect square
        boolean isPerfectSquare = checkPerfectSquare(number);
        
        // Print the result
        System.out.println(isPerfectSquare);
        
        scanner.close();
    }
    
    public static boolean checkPerfectSquare(int number) {
        int sqrt = (int) Math.sqrt(number);
        return sqrt * sqrt == number;
    }
}