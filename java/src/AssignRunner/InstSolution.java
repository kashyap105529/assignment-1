package AssignRunner;
import assignment.Institution;
import java.util.Scanner;
public class InstSolution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading input for four Institution objects
        Institution[] institutions = new Institution[4];
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter details for institution " + (i + 1) + ":");
            System.out.print("Institution ID: ");
            int institutionId = Integer.parseInt(scanner.nextLine().trim());
            System.out.print("Institution Name: ");
            String institutionName = scanner.nextLine().trim();
            System.out.print("Number of Students Placed: ");
            int noOfStudentsPlaced = Integer.parseInt(scanner.nextLine().trim());
            System.out.print("Number of Students Cleared: ");
            int noOfStudentsCleared = Integer.parseInt(scanner.nextLine().trim());
            System.out.print("Location: ");
            String location = scanner.nextLine().trim();
            institutions[i] = new Institution(institutionId, institutionName, noOfStudentsPlaced, noOfStudentsCleared, location);
        }

        // Reading the location and institutionName values
        System.out.print("Enter the location to search: ");
        String searchLocation = scanner.nextLine().trim();
        System.out.print("Enter the institution name to search: ");
        String searchInstitutionName = scanner.nextLine().trim();

        // Finding and printing the number of clearances for the given location
        int totalClearance = findNumClearancedByLoc(institutions, searchLocation);
        if (totalClearance > 0) {
            System.out.println(totalClearance);
        } else {
            System.out.println("There are no cleared students in this particular location");
        }

        // Finding and printing the institution name and grade for the given institution name
        Institution institution = updateInstitutionGrade(institutions, searchInstitutionName);
        if (institution != null) {
            System.out.println(institution.getInstitutionName() + "::" + institution.getGrade());
        } else {
            System.out.println("No Institute is available with the specified name");
        }

        scanner.close();
    }

    public static int findNumClearancedByLoc(Institution[] instArray, String location) {
        int sum = 0;
        for (Institution inst : instArray) {
            if (inst.getLocation().equalsIgnoreCase(location)) {
                sum += inst.getNoOfStudentsCleared();
            }
        }
        return sum;
    }

    public static Institution updateInstitutionGrade(Institution[] instArray, String instName) {
        for (Institution inst : instArray) {
            if (inst.getInstitutionName().equalsIgnoreCase(instName)) {
                int rating = (inst.getNoOfStudentsPlaced() * 100) / inst.getNoOfStudentsCleared();
                if (rating >= 80) {
                    inst.setGrade("A");
                } else {
                    inst.setGrade("B");
                }
                return inst;
            }
        }
        return null;
    }
}
