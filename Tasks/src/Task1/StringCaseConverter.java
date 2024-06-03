package Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StringCaseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of strings in the list:");
        int numberOfStrings = scanner.nextInt();
        scanner.nextLine();  // consume the newline
        
        List<String> list = new ArrayList<>();
        System.out.println("Enter the strings:");
        
        for (int i = 0; i < numberOfStrings; i++) {
            list.add(scanner.nextLine());
        }
        
        scanner.close();
        
        List<String> upperCaseList = list.stream()
                                         .map(String::toUpperCase)
                                         .collect(Collectors.toList());
        
        List<String> lowerCaseList = list.stream()
                                         .map(String::toLowerCase)
                                         .collect(Collectors.toList());
        
        System.out.println("List in uppercase: " + upperCaseList);
        System.out.println("List in lowercase: " + lowerCaseList);
    }
}
