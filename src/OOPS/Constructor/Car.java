package OOPS.Constructor;

class Car {
    String brand;
    String color;
    int speed;

    // Only ONE constructor needed
    Car(String brand, String color, int speed) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }

    public void drive() {
        System.out.println(brand + " is driving at " + speed + " km/h");
    }
}
