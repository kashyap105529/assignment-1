package AssignRunner;
import assignment.Associate;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Associate[] associates = new Associate[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            int id = Integer.parseInt(scanner.nextLine());
            String name = scanner.nextLine();
            String technology = scanner.nextLine();
            int experienceInYears = Integer.parseInt(scanner.nextLine());
            associates[i] = new Associate(id, name, technology, experienceInYears);
        }

        System.out.println("Enter the search technology:");
        String searchTechnology = scanner.nextLine();

        int count = 0;
        for (int i = 0; i < 5; i++) {
            if (associates[i].getTechnology().equalsIgnoreCase(searchTechnology)
                    && associates[i].getExperienceInYears() % 5 == 0) {
                System.out.println(associates[i].getId());
                count++;
            }
        }

        if (count == 0) {
            System.out.println("No associates found with the specified technology and experience.");
        }

        scanner.close();
    }

    public static Associate[] associatesForGivenTechnology(Associate[] associates, String searchTechnology) {
        // Filtering associates based on searchTechnology and experienceInYears
        int count = 0;
        for (Associate associate : associates) {
            if (associate.getTechnology().equalsIgnoreCase(searchTechnology)
                    && associate.getExperienceInYears() % 5 == 0) {
                count++;
            }
        }

        // Creating a new array to store the filtered associates
        Associate[] result = new Associate[count];
        int index = 0;
        for (Associate associate : associates) {
            if (associate.getTechnology().equalsIgnoreCase(searchTechnology)
                    && associate.getExperienceInYears() % 5 == 0) {
                result[index++] = associate;
            }
        }

        return result;
    }
}