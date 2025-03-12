import java.util.InputMismatchException;
import java.util.Scanner;

public class SumLessThanC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,sumAB;
        boolean validInput = false;

        while (!validInput){
            try {
                System.out.println("Type the value of A: ");
                a = sc.nextInt();
                System.out.println("Type the value of B: ");
                b = sc.nextInt();
                System.out.println("Type the value of C: ");
                c = sc.nextInt();

                sumAB = a + b;
                System.out.println("The sum of A + B is: " + sumAB);

                if (sumAB > c){
                    System.out.println("Sum(A,B) > C");
                }else
                    System.out.println("Sum(A,B) <= C");
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
