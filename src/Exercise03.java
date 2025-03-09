import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        boolean validInput = false;

        while (!validInput){
            try {
                System.out.println("Type the first number: ");
                a = sc.nextInt();

                System.out.println("Type the second number: ");
                b = sc.nextInt();

                if (a == b){
                    c = a + b;
                    System.out.printf("The sum of (%d + %d) is: %d.", a,b,c);
                }else {
                    c = a * b;
                    System.out.printf("The multiplication of (%d * %d) is %d.", a,b,c);
                }

                validInput = true;
            }catch (InputMismatchException e) {
                System.out.println("Please type a valid number.\n");
                sc.nextLine();
            }
        }
        sc.close();
    }
}
