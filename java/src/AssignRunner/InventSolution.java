package AssignRunner;
import java.util.Scanner;
import assignment.Inventory;
public class InventSolution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading input for four Inventory objects and limit
        Inventory[] inventories = new Inventory[4];
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter details for Inventory " + (i + 1) + ":");
            System.out.print("Inventory ID: ");
            String inventoryId = scanner.nextLine().trim();
            System.out.print("Maximum Quantity: ");
            int maximumQuantity = Integer.parseInt(scanner.nextLine().trim());
            System.out.print("Current Quantity: ");
            int currentQuantity = Integer.parseInt(scanner.nextLine().trim());
            System.out.print("Threshold: ");
            int threshold = Integer.parseInt(scanner.nextLine().trim());
            inventories[i] = new Inventory(inventoryId, maximumQuantity, currentQuantity, threshold);
        }
        
        System.out.print("Enter the limit: ");
        int limit = Integer.parseInt(scanner.nextLine().trim());

        // Calling replenish method and printing the output
        Inventory[] replenishedInventories = replenish(inventories, limit);
        for (Inventory inv : replenishedInventories) {
            String fillType = "Non-Critical Filling";
            if (inv.getThreshold() > 75) {
                fillType = "Critical Filling";
            } else if (inv.getThreshold() >= 50 && inv.getThreshold() <= 75) {
                fillType = "Moderate Filling";
            }
            System.out.println(inv.getInventoryId() + " " + fillType);
        }

        scanner.close();
    }

    public static Inventory[] replenish(Inventory[] inventories, int limit) {
        int count = 0;
        for (Inventory inv : inventories) {
            if (limit <= inv.getThreshold()) {
                count++;
            }
        }

        Inventory[] result = new Inventory[count];
        int index = 0;
        for (Inventory inv : inventories) {
            if (limit <= inv.getThreshold()) {
                result[index++] = inv;
            }
        }
        return result;
    }
}