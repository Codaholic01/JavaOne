package OOPS.OOPSBasic;

public class CarDemo {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.speed = 200;
        car1.brand = "BMW";
        car1.color = "Matte Black";
        car1.drive();

        Car car2 = new Car();
        car2.speed = 150;
        car2.brand = "Woks";
        car2.color = "Matte Black";
        car2.drive();
    }
}
