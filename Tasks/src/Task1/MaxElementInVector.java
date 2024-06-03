package Task1;

import java.util.Vector;
import java.util.Scanner;
import java.util.Collections;

public class MaxElementInVector {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of elements you want to add to the Vector:");
        int numberOfElements = scanner.nextInt();
        
        System.out.println("Enter the elements (integers):");
        for (int i = 0; i < numberOfElements; i++) {
            vector.add(scanner.nextInt());
        }
        
        scanner.close();
        
        int maxElement = Collections.max(vector);

        System.out.println("The maximum element in the Vector is: " + maxElement);
    }
}
