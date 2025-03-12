import java.util.InputMismatchException;
import java.util.Scanner;

public class EvenOrOddPositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        boolean validInput = false;

        while (!validInput){
            try {
                System.out.println("Type a number: ");
                num = sc.nextInt();

                if (num > 0){
                    System.out.println("The number is Positive");
                }else {
                    System.out.println("The number is Negative");
                }

                if (num % 2 == 0){
                    System.out.println("The number is Even");
                }else{
                    System.out.println("The number is Odd");
                }
                validInput = true;
            }catch (InputMismatchException e){
                System.out.println("Please type a valid number");
                sc.nextLine();
            }catch(Exception e){
                System.out.println("Something went wrong");
                sc.nextLine();
            }
        }
        sc.close();
    }
}
