package FunctinalProgrammes;

import java.util.Scanner;

public class euclideandistance {
    public static void main(String[] args) {

        double x1, x2, y1, y2;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter location of x1: ");
        x1 = scanner.nextDouble();

        System.out.print("Enter location of x2: ");
        x2 = scanner.nextDouble();

        System.out.print("Enter location of y1: ");
        y1 = scanner.nextDouble();

        System.out.print("Enter location of y2: ");
        y2 = scanner.nextDouble();

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("distance between: " + distance);

    }
}

