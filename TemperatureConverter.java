import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("Enter the temperature value:");
        double temperature = scanner.nextDouble();

        System.out.println("Enter the original unit of measurement (Celsius, Fahrenheit, or Kelvin):");
        String originalUnit = scanner.next().toLowerCase();

        if (originalUnit.equals("celsius")) {
            double fahrenheit = celsiusToFahrenheit(temperature);
            double kelvin = celsiusToKelvin(temperature);
            System.out.println("Converted temperatures:");
            System.out.println("Fahrenheit: " + fahrenheit);
            System.out.println("Kelvin: " + kelvin);
        } else if (originalUnit.equals("fahrenheit")) {
            double celsius = fahrenheitToCelsius(temperature);
            double kelvin = celsiusToKelvin(celsius);
            System.out.println("Converted temperatures:");
            System.out.println("Celsius: " + celsius);
            System.out.println("Kelvin: " + kelvin);
        } else if (originalUnit.equals("kelvin")) {
            double celsius = kelvinToCelsius(temperature);
            double fahrenheit = celsiusToFahrenheit(celsius);
            System.out.println("Converted temperatures:");
            System.out.println("Celsius: " + celsius);
            System.out.println("Fahrenheit: " + fahrenheit);
        } else {
            System.out.println("Invalid unit of measurement.");
        }

        scanner.close();
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }
}
