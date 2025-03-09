import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double finalValue = 0.0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter the product price: $ ");
                double productValue = sc.nextDouble();

                System.out.println("Choose the payment method:");
                System.out.println("1 - Cash or Pix (15% discount)");
                System.out.println("2 - Credit Card (Cash) (10% discount)");
                System.out.println("3 - Installment in 2 times (no interest)");
                System.out.println("4 - Installment in 3 times or more (10% interest)");
                int paymentMethod = sc.nextInt();

                switch (paymentMethod) {
                    case 1:
                        finalValue = productValue * 0.85;
                        System.out.printf("Amount to be paid: $ %.2f (15%% discount)\n", finalValue);
                        break;
                    case 2:
                        finalValue = productValue * 0.90;
                        System.out.printf("Amount to be paid: $ %.2f (10%% discount)\n", finalValue);
                        break;
                    case 3:
                        finalValue = productValue;
                        System.out.printf("Amount to be paid: $ %.2f (no interest)\n", finalValue);
                        break;
                    case 4:
                        finalValue = productValue * 1.10;
                        System.out.printf("Amount to be paid: $ %.2f (10%% interest)\n", finalValue);
                        break;
                    default:
                        System.out.println("Invalid payment method.");
                        break;
                }
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid Value. Try Again.\n");
                sc.nextLine();
            }
        }
    }
}