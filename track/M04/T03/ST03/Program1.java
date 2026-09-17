
class Car {

    static void convertkmIntoMiles() {
        System.out.println("Converting Km into Miles");
    }

    void calculateMileage() {
        System.out.println("Calculating Mileage");
    }
}

public class Program1 {

    public static void main(String[] args) {
        Car.convertkmIntoMiles();
        Car c1 = new Car();
        c1.calculateMileage();
        Car c2 = new Car();
        c2.calculateMileage();
    }
}
