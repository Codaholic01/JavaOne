//Print vs Println vs Printf in Java
//  :  Output statements look simple, but good developers know when and why to use each one.

/*
   Java provides three commonly used output methods:
    .  print()
    . println()
    . printf()
 */

package JavaBasic.basics.PrintVsPrintf;

public class Simple {
    public static void main(String[] args) {
        // System.out.print("Hello");
        // System.out.print(" Java");









        /*
     2.    System.out.println()
            🔹 What it does
              Prints output and moves to a new line
              Automatically adds a line break
         */
        // System.out.println("Hello");
        // System.out.println(" Java");










        /*
        3️⃣ System.out.printf()
           🔹  What it does
             Prints formatted output
             Uses format specifiers like C language


             🔹 Common format specifiers
               Specifier	                                                                Meaning
                 %d	                                                                        Integer
                 %f	                                                                        Floating point
                 %s	                                                                        String
                 %c	                                                                        Character
                 %.2f	                                                                    2 decimal places
         */
        int age = 22;
        double marks = 85.6789;

        System.out.printf("Age: %d%n", age);
        System.out.printf("Marks: %.2f", marks);


    }

}
