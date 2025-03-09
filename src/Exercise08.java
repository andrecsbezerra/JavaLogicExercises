import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Type the first number");
        int a = sc.nextInt();
        System.out.println("Type the second number");
        int b = sc.nextInt();
        System.out.println("Type the third number");
        int c = sc.nextInt();

        numbers.add(a);
        numbers.add(b);
        numbers.add(c);

        System.out.println(numbers.reversed());
        sc.close();
    }
}
