package AssignRunner;
import assignment.Phone;
import java.util.Scanner;

public class deviceSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading input for four Phone objects
        Phone[] phones = new Phone[4];
        for (int i = 0; i < 4; i++) {
            int phoneId = Integer.parseInt(scanner.nextLine().trim());
            String os = scanner.nextLine().trim();
            String brand = scanner.nextLine().trim();
            int price = Integer.parseInt(scanner.nextLine().trim());
            phones[i] = new Phone(phoneId, os, brand, price);
        }

        // Reading the brand and os values
        String searchBrand = scanner.nextLine().trim();
        String searchOs = scanner.nextLine().trim();

        // Finding and printing the price for the given brand
        int totalPrice = findPriceForGivenBrand(phones, searchBrand);
        if (totalPrice > 0) {
            System.out.println(totalPrice);
        } else {
            System.out.println("The given Brand is not available");
        }

        // Finding and printing the phoneId for the given os
        Phone phone = getPhoneIdBasedOnOs(phones, searchOs);
        if (phone != null) {
            System.out.println(phone.getPhoneId());
        } else {
            System.out.println("No phones are available with specified os and price range");
        }

        scanner.close();
    }

    public static int findPriceForGivenBrand(Phone[] phones, String brand) {
        int sum = 0;
        for (Phone phone : phones) {
            if (phone.getBrand().equalsIgnoreCase(brand)) {
                sum += phone.getPrice();
            }
        }
        return sum;
    }

    public static Phone getPhoneIdBasedOnOs(Phone[] phones, String os) {
        for (Phone phone : phones) {
            if (phone.getOs().equalsIgnoreCase(os) && phone.getPrice() >= 50000) {
                return phone;
            }
        }
        return null;
    }
}