import java.util.InputMismatchException;
import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Type the first value: ");
            int n1 = sc.nextInt();
            System.out.println("Type the second value value: ");
            int n2 = sc.nextInt();

            int division = n1 / n2;
            int remainder = n1 % n2;

            System.out.println("Quocient: " + division);
            System.out.println("Remainder: " + remainder);
        } catch (InputMismatchException e) {
            System.out.println("Type a valid value");
        }
    }
}
