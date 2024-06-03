package Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumEvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of integers in the list:");
        int numberOfIntegers = scanner.nextInt();
        
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter the integers:");
        
        for (int i = 0; i < numberOfIntegers; i++) {
            list.add(scanner.nextInt());
        }
        
        scanner.close();
        
        int sumEven = list.stream()
                          .filter(n -> n % 2 == 0)
                          .collect(Collectors.summingInt(Integer::intValue));
        
        int sumOdd = list.stream()
                         .filter(n -> n % 2 != 0)
                         .collect(Collectors.summingInt(Integer::intValue));
        
        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);
    }
}
