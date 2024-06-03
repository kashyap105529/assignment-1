package Task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MinMaxInList {
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
        
        int min = Collections.min(list);
        int max = Collections.max(list);
        
        System.out.println("Minimum element in the list: " + min);
        System.out.println("Maximum element in the list: " + max);
    }
}
