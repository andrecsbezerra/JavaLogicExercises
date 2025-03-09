import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean validInput = false;

        while (!validInput){
            try {
                System.out.println("Type the first grade: ");
                double a = sc.nextDouble();
                System.out.println("Type the second grade:");
                double b = sc.nextDouble();
                System.out.println("Type the third grade: ");
                double c = sc.nextDouble();
                System.out.println("Type the third grade: ");
                double d = sc.nextDouble();

                double media = (a + b + c + d) / 4;
                System.out.println("The media is: " + media);
                if (media >= 7){
                    System.out.println("Approved");
                }else {
                    System.out.println("Reproved ");
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
