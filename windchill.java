package FunctinalProgrammes;

import java.util.Scanner;

public class windchill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double windspeed, temperature, windchill;
        //collect user input
        System.out.println("Enter temperature (Fahrenheit): ");
        temperature = scanner.nextDouble();
        System.out.println("Enter wind speed: ");
        windspeed = scanner.nextDouble();
        // Calculate wind chill
        if (temperature > 50 || windspeed > 120 || windspeed < 3) {
            System.out.println("Invalid");
        } else {
            double windChill = 35.74 + (0.6215 * temperature) +
                    ((0.4275 * temperature - 35.75) * Math.pow(windspeed, 0.16));
            System.out.println("Wind chill is: " + windChill);
        }
    }
}
