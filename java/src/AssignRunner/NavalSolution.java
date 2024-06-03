package AssignRunner;
import java.util.Scanner;
import assignment.NavalVessel;
public class NavalSolution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        NavalVessel[] vessels = new NavalVessel[4];
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter details for Naval Vessel " + (i + 1) + ":");
            System.out.print("Vessel Id: ");
            int vesselId = Integer.parseInt(scanner.nextLine().trim());
            System.out.print("Vessel Name: ");
            String vesselName = scanner.nextLine().trim();
            System.out.print("No. of Voyages Planned: ");
            int noOfVoyagesPlanned = Integer.parseInt(scanner.nextLine().trim());
            System.out.print("No. of Voyages Completed: ");
            int noOfVoyagesCompleted = Integer.parseInt(scanner.nextLine().trim());
            System.out.print("Purpose: ");
            String purpose = scanner.nextLine().trim();
            vessels[i] = new NavalVessel(vesselId, vesselName, noOfVoyagesPlanned, noOfVoyagesCompleted, purpose);
        }

        System.out.print("Enter percentage: ");
        int percentage = Integer.parseInt(scanner.nextLine().trim());
        System.out.print("Enter purpose: ");
        String purpose = scanner.nextLine().trim();

        // Call methods and print the output
        int avgVoyages = findAvgVoyagesByPct(vessels, percentage);
        System.out.println(avgVoyages);
        NavalVessel resultVessel = findVesselByGrade(vessels, purpose);
        if (resultVessel != null) {
            System.out.println(resultVessel.getVesselName() + "%" + resultVessel.getClassification());
        } else {
            System.out.println("No Naval Vessel is available with the specified purpose");
        }

        scanner.close();
    }

    public static int findAvgVoyagesByPct(NavalVessel[] vessels, int percentage) {
        int sum = 0;
        int count = 0;
        for (NavalVessel vessel : vessels) {
            int pct = (vessel.getNoOfVoyagesCompleted() * 100) / vessel.getNoOfVoyagesPlanned();
            if (pct >= percentage) {
                sum += vessel.getNoOfVoyagesCompleted();
                count++;
            }
        }
        return count == 0 ? 0 : sum / count;
    }

    public static NavalVessel findVesselByGrade(NavalVessel[] vessels, String purpose) {
        for (NavalVessel vessel : vessels) {
            if (vessel.getPurpose().equalsIgnoreCase(purpose)) {
                int pct = (vessel.getNoOfVoyagesCompleted() * 100) / vessel.getNoOfVoyagesPlanned();
                if (pct == 100) {
                    vessel.setClassification("Star");
                } else if (pct >= 80) {
                    vessel.setClassification("Leader");
                } else if (pct >= 55) {
                    vessel.setClassification("Inspirer");
                } else {
                    vessel.setClassification("Striver");
                }
                return vessel;
            }
        }
        return null;
    }
}