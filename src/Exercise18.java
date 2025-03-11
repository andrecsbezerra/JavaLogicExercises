import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            double yearsNedded = 0;
            double saraHeight = 110;
            double franciscoHeight = 150;

            while (saraHeight <= franciscoHeight){
                saraHeight +=3;
                franciscoHeight+=2;
                yearsNedded++;
            }
            System.out.printf("Sarah: %.2f \n", saraHeight / 100);
            System.out.printf("Franciso: %.2f \n", franciscoHeight / 100);
            System.out.printf("Years Nedded: %.0f", yearsNedded);
    }
}
