package AssignRunner;
import assignment.Associate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Associate> associates = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int id = scanner.nextInt();
            scanner.nextLine(); 
            String name = scanner.nextLine();
            String technology = scanner.nextLine();
            int experienceInYears = scanner.nextInt();
            associates.add(new Associate(id, name, technology, experienceInYears));
        }


        scanner.nextLine();
        String searchTechnology = scanner.nextLine();

        List<Associate> filteredAssociates = associatesForGivenTechnology(associates, searchTechnology);
        for (Associate associate : filteredAssociates) {
            System.out.println(associate.getId());
        }

        scanner.close();
    }

    public static List<Associate> associatesForGivenTechnology(List<Associate> associates, String searchTechnology) {
        List<Associate> filteredAssociates = new ArrayList<>();
        for (Associate associate : associates) {
            if (associate.getTechnology().equalsIgnoreCase(searchTechnology)
                    && associate.getExperienceInYears() % 5 == 0) {
                filteredAssociates.add(associate);
            }
        }
        return filteredAssociates;
    }
}