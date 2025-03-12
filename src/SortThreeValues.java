import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class SortThreeValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean validInput = false;
        List<Integer> numbers = new ArrayList<>();
        while (!validInput) {
            try {
                System.out.println("Type the first number: ");
                int a = sc.nextInt();
                System.out.println("Type the second number: ");
                int b = sc.nextInt();
                System.out.println("Type the third number: ");
                int c = sc.nextInt();

                numbers.add(a);
                numbers.add(b);
                numbers.add(c);

                System.out.println(numbers.reversed());
                validInput = true;
            }catch (InputMismatchException e){
                System.out.println("Please type a valid number.\n");
                sc.nextLine();
            }
        }
        sc.close();
    }
}
