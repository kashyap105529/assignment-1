package Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Optional;

public class MinMaxValues {
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

        Optional<Integer> max = list.stream().max(Integer::compareTo);
        Optional<Integer> min = list.stream().min(Integer::compareTo);

        if (max.isPresent() && min.isPresent()) {
            System.out.println("Maximum value: " + max.get());
            System.out.println("Minimum value: " + min.get());
        } else {
            System.out.println("List is empty");
        }
    }
}
