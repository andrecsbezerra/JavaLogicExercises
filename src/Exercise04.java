import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,numSuccessor,numPredecessor;
        boolean validInput = false;

        while (!validInput){
            try {
                System.out.println("Type a number: ");
                num = sc.nextInt();

                numSuccessor = num + 1;
                numPredecessor = num - 1;

                System.out.printf("""
                        The chosen number is %d
                        Your successor is %d
                        Your predecessor is %d
                        """, num, numSuccessor,numPredecessor);

                validInput = true;
            }catch (InputMismatchException e){
                System.out.println("Please type a valid number.\n");
                sc.nextLine();
            }
        }
        sc.close();
    }
}
