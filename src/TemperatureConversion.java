import java.util.InputMismatchException;
import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Welcome to the Temperature Converter");
            System.out.println("Type the Fahrenheit Temperature: ");
            double fahrenheit = sc.nextDouble();

            double celcius = (5 * (fahrenheit - 32) / 9);
            System.out.println("Fahrenheit: " + fahrenheit);
            System.out.println("Celcius: " + celcius);
        } catch (InputMismatchException e) {
            System.out.println("Type a valid value");
        }
    }
}
