package OOPS.Constructor;

public class StudentDemo {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student("Raghav");
        Student s3 = new Student("Raghav", 20);
        Student s4 = new Student("Raghav", 20, "Delhi");

        s1.display();  // Unknown | 0 | Unknown
        s2.display();  // Raghav | 0 | Unknown
        s3.display();  // Raghav | 20 | Unknown
        s4.display();  // Raghav | 20 | Delhi
    }
}
