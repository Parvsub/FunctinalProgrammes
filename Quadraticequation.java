package FunctinalProgrammes;

import java.util.Scanner;

public class Quadraticequation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   //This statement will capture the user input
        int a, b, c;
        double root1, root2;
        System.out.println("Enter the values of a,b, and c");
        a = scanner.nextInt();                      //Captured input would be stored in inputValue
        b = scanner.nextInt();
        c = scanner.nextInt();

        root1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        root2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);

        System.out.println("Root are " + root1 + " " + root2);

    }
}
