package AssignRunner;
import assignment.Medicine;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MedicineSolution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Medicine[] medicines = new Medicine[4];
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter details for Medicine " + (i + 1) + ":");
            System.out.print("Medicine Name: ");
            String medicineName = scanner.nextLine().trim();
            System.out.print("Batch: ");
            String batch = scanner.nextLine().trim();
            System.out.print("Disease: ");
            String disease = scanner.nextLine().trim();
            System.out.print("Price: ");
            int price = Integer.parseInt(scanner.nextLine().trim());
            medicines[i] = new Medicine(medicineName, batch, disease, price);
        }

        System.out.print("Enter the disease: ");
        String disease = scanner.nextLine().trim();
        List<Integer> prices = getPriceByDisease(medicines, disease);
        System.out.println("Output:");
        for (Integer price : prices) {
            System.out.println(price);
        }

        scanner.close();
    }

    public static List<Integer> getPriceByDisease(Medicine[] medicines, String disease) {
        List<Integer> prices = new ArrayList<>();
        for (Medicine medicine : medicines) {
            if (medicine.getDisease().equalsIgnoreCase(disease)) {
                prices.add(medicine.getPrice());
            }
        }
        Collections.sort(prices);
        return prices;
    }
}