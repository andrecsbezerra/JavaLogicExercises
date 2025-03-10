import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;

        while (!validInput){
            try {
                double a, b;

                System.out.print("Enter the value of a: ");
                a = scanner.nextDouble();
                System.out.print("Enter the value of B: ");
                b = scanner.nextDouble();

                System.out.println("Original values:");
                System.out.println("a = " + a);
                System.out.println("B = " + b);

                double temp = a;
                a = b;
                b = temp;

                System.out.println("Swapped values:");
                System.out.println("a = " + a);
                System.out.println("B = " + b);
            }catch (InputMismatchException e){
                System.out.println("Invalid value");
            }
        }

        scanner.close();
    }
}


