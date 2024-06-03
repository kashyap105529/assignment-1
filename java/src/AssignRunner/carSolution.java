package AssignRunner;
import assignment.AutonomousCar;
import java.util.Scanner;
class carSolution {
    public static int findTestPassedByEnv(AutonomousCar[] cars, String environment) {
        int totalTestsPassed = 0;
        for (AutonomousCar car : cars) {
            if (car.getEnvironment().equalsIgnoreCase(environment)) {
                totalTestsPassed += car.getNoOfTestsPassed();
            }
        }
        return totalTestsPassed;
    }

    public static AutonomousCar updateCarGrade(String brand, AutonomousCar[] cars) {
        for (AutonomousCar car : cars) {
            if (car.getBrand().equalsIgnoreCase(brand)) {
                int rating = (car.getNoOfTestsPassed() * 100) / car.getNoOfTestsConducted();
                if (rating >= 80) {
                    car.setGrade("A1");
                } else {
                    car.setGrade("B2");
                }
                return car;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AutonomousCar[] cars = new AutonomousCar[4];
        
        for (int i = 0; i < 4; i++) {
            int carId = Integer.parseInt(scanner.nextLine().trim());
            String brand = scanner.nextLine().trim();
            int noOfTestsConducted = Integer.parseInt(scanner.nextLine().trim());
            int noOfTestsPassed = Integer.parseInt(scanner.nextLine().trim());
            String environment = scanner.nextLine().trim();
            cars[i] = new AutonomousCar(carId, brand, noOfTestsConducted, noOfTestsPassed, environment);
        }
        
        String searchEnvironment = scanner.nextLine().trim();
        String searchBrand = scanner.nextLine().trim();
        
        int totalTestsPassed = findTestPassedByEnv(cars, searchEnvironment);
        if (totalTestsPassed > 0) {
            System.out.println(totalTestsPassed);
        } else {
            System.out.println("There are no tests passed in this particular environment");
        }
        
        AutonomousCar car = updateCarGrade(searchBrand, cars);
        if (car != null) {
            System.out.println(car.getBrand() + "::" + car.getGrade());
        } else {
            System.out.println("No Car is available with the specified brand");
        }
        
        scanner.close();
    }
}