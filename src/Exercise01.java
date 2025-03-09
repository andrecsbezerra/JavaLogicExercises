import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        int a,b,c,sumAB;

        Scanner sc = new Scanner(System.in);
        System.out.println("Type the value of A: ");
        a = sc.nextInt();
        System.out.println("Type the value of B: ");
        b = sc.nextInt();
        System.out.println("Type the value of C: ");
        c = sc.nextInt();

        sumAB = a + b;
        System.out.println("The sum of A + B is: " + sumAB);

        if (sumAB > c){
            System.out.println("C > sum(A,B)");
        }else
            System.out.println("C <= sum(A,B)");

    }
}
