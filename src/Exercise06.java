import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double value;
        double valuePlusFivePercent = 0;
        boolean validInput = false;
        while (!validInput){
            try {
                System.out.println("Type a number: ");
                value = sc.nextDouble();

                valuePlusFivePercent = value * 1.05;
                System.out.printf("Your number +5%% is:  %.2f ", valuePlusFivePercent);

                validInput = true;
            }catch (InputMismatchException e){
                System.out.println("Please type a valid number.\n");
                sc.nextLine();
            }
        }
        sc.close();
    }
}
