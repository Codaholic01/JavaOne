package OOPS.Constructor;

public class CarDemo {
    public static void main(String[] args) {

        Car car1 = new Car("BMW", "Matte Black", 200);
        Car car2 = new Car("Volks", "Matte Black", 150);
        Car car3 = new Car("Lambo", "Matte Black", 250);

        car1.drive();
        car2.drive();
        car3.drive();
    }
}

