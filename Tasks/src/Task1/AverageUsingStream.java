package Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageUsingStream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of elements in the list:");
        int numberOfElements = scanner.nextInt();
        
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter the elements of the list:");
        
        for (int i = 0; i < numberOfElements; i++) {
            list.add(scanner.nextInt());
        }
        
        scanner.close();
        
        double average = list.stream()
                             .mapToInt(Integer::intValue)
                             .average()
                             .orElse(0.0);
        
        System.out.println("Average of the list: " + average);
    }
}
