import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Exercise10List {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean validInput = false;
        List<Double> numbers = new ArrayList<>();
        while (!validInput) {
            try {
                System.out.println("Type the first grade: ");
                double a = sc.nextDouble();
                System.out.println("Type the second grade: ");;
                double b = sc.nextDouble();
                System.out.println("Type the third grade: ");
                double c = sc.nextDouble();

                numbers.add(a);
                numbers.add(b);
                numbers.add(c);

                double sum = 0;
                for (double grade: numbers){
                    sum += grade;
                }
                double average = sum / numbers.size();
                System.out.println("Your average is: " + average);
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
