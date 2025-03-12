import java.util.InputMismatchException;
import java.util.Scanner;

public class AverageGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean validInput = false;

        while (!validInput){
            try {
                System.out.println("Type the first grade: ");
                double a = sc.nextInt();
                System.out.println("Type the second grade:");
                double b = sc.nextInt();
                System.out.println("Type the third grade: ");
                double c = sc.nextInt();

                double media = (a + b + c) / 3;
                System.out.println("The media is: " + media);
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
