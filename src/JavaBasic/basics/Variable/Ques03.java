//What will happen if you try to print a local variable in Java without initializing it? Write a small program to show this.

package JavaBasic.basics.Variable;

public class Ques03 {
    public static void main(String[] args) {
        //  int number;   // local variable (not initialized)
        // System.out.println(number);// ERROR


        int num = 10; // initialized
        System.out.println(num);

    }
}

