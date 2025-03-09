import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boolean validInput = false;
        while (!validInput){
            try {
                System.out.println("Type the first Boolean Value:");
                boolean val1 = sc.nextBoolean();
                System.out.println("Type the second Boolean Value:");
                boolean val2 = sc.nextBoolean();

                if (val1&&val2){
                    System.out.println("Both are true");
                } else if (!val1 && val2) {
                    System.out.println("Both are false");
                }else {
                    System.out.println("Both are different");
                }
                validInput = true;
            }catch (InputMismatchException e){
                System.out.println("Please type a valid Boolean Type.\n");
                sc.nextLine();
            }
        }
        sc.close();
    }
}