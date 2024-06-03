package Task1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class ArrayToCollection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of elements in the array:");
        int numberOfElements = scanner.nextInt();
        
        String[] array = new String[numberOfElements];
        System.out.println("Enter the elements of the array:");
        
        for (int i = 0; i < numberOfElements; i++) {
            array[i] = scanner.next();
        }
        
        scanner.close();
        
        Collection<String> collection = Arrays.asList(array);
        
        System.out.println("The collection is: " + collection);
    }
}
