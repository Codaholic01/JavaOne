package JavaBasic.Operator.AirthmaticOperator.Oues;

public class ArithmeticOperators {
    public static void main(String[] args) {

        int a = 20;
        int b = 5;

        // Basic Arithmetic Operations
        System.out.println("Addition (a + b): " + (a + b));
        System.out.println("Subtraction (a - b): " + (a - b));
        System.out.println("Multiplication (a * b): " + (a * b));
        System.out.println("Division (a / b): " + (a / b));
        System.out.println("Modulus (a % b): " + (a % b));

        // Increment and Decrement Operators
        int x = 10;
        System.out.println("\nInitial value of x: " + x);

        System.out.println("Post-increment (x++): " + (x++));
        System.out.println("After post-increment: " + x);

        System.out.println("Pre-increment (++x): " + (++x));

        System.out.println("Post-decrement (x--): " + (x--));
        System.out.println("After post-decrement: " + x);

        System.out.println("Pre-decrement (--x): " + (--x));

        // Compound Assignment Operators
        int num = 50;

        num += 10;   // num = num + 10
        System.out.println("After += : " + num);

        num -= 5;    // num = num - 5
        System.out.println("After -= : " + num);

        num *= 2;    // num = num * 2
        System.out.println("After *= : " + num);

        num /= 5;    // num = num / 5
        System.out.println("After /= : " + num);

        num %= 3;    // num = num % 3
        System.out.println("After %= : " + num);
    }
}

