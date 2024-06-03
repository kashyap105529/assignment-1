package assignment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DataTranmisson {

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static int findSumOfPrimesAndSecondLargest(String input) {
        String[] parts = input.trim().substring(0, input.length() - 1).split(" ");
        
        List<Integer> primeNumbers = new ArrayList<>();
        
        for (String part : parts) {
            int number = Integer.parseInt(part);
            if (isPrime(number)) {
                primeNumbers.add(number);
            }
        }
        
        Collections.sort(primeNumbers);
        
        int totalPrimeCount = primeNumbers.size();
        
        int secondLargestPrime = primeNumbers.get(totalPrimeCount - 2);
        
        int result = totalPrimeCount + secondLargestPrime;
        
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine().trim();
        
        int result = findSumOfPrimesAndSecondLargest(input);
        
        System.out.println(result);
        
        scanner.close();
    }
}
