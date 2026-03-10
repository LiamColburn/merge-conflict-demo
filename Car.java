
public class Car {
    private final int year;
    private final String brand;
    private final String model;

    public Car (int year, String brand, String model) {
        this.year = year;
        this.brand = brand;
        this.model = model;
    }
    
    public void printInfo() {
        System.out.printf("This car is a %d %s %s%n", year, brand, model);
    }
}