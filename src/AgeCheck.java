import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean validInput = false;
        while (!validInput){
            try{// Ask for the user's name
                System.out.print("Please enter your name: ");
                String name = sc.nextLine();

                // Ask for the user's age
                System.out.print("Please enter your age: ");
                int age = sc.nextInt();

                // Determine if the user is above or underage
                if (age >= 18) {
                    System.out.printf("%s, you are adult.\n", name);
                } else {
                    System.out.printf("%s, you are underage.\n", name);
                }
                validInput = true;
            }catch (InputMismatchException e){
                System.out.println("Check The Fields Again.\n");
                sc.nextLine();
            }
        }
        sc.close();
    }
}