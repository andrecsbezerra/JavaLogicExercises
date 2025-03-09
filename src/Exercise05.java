import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float userSalary;
        float minimumSalary = 1293.20F;
        boolean validInput = false;

        while (!validInput){
            try {
                System.out.printf("Minimum Salary:  %.2f\n", minimumSalary);

                System.out.println("Type the user Salary: ");
                userSalary = sc.nextFloat();

                int i = 0;
                while (userSalary >= minimumSalary){
                    userSalary -= minimumSalary;
                    i++;
                }
                System.out.printf("Inside your salary can fit %d minimum wages", i);

                validInput = true;
            }catch (InputMismatchException e){
                System.out.println("Please type a valid number.\n");
                sc.nextLine();
            }
        }
        sc.close();
    }
}
