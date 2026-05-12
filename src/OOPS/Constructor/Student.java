package OOPS.Constructor;

class Student {
    String name;
    int age;
    String city;

    // Master Constructor
    Student(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    // Flexibility — multiple ways to create object using this()
    Student() {
        this("Unknown", 0, "Unknown");
    }

    Student(String name) {
        this(name, 0, "Unknown");
    }

    Student(String name, int age) {
        this(name, age, "Unknown");
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
        System.out.println("City : " + city);
        System.out.println("-------------------");
    }
}


