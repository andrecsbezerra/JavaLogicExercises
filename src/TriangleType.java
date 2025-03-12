import java.util.InputMismatchException;
import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Type the first value: ");
            int n1 = sc.nextInt();
            System.out.println("Type the first value: ");
            int n2 = sc.nextInt();
            System.out.println("Type the first value: ");
            int n3 = sc.nextInt();
            if(n1 + n2 + n3 != 180){
                System.out.println("Enter a valid value for a triangle(180°)");
            }else if (n1 == n2 && n2 == n3){
                System.out.println("Equilateral Triangle");
            }else if(n1 == n2 || n2 == n3 || n1 == n3){
                System.out.println("Isosceles Triangle");
            } else {
                System.out.println("Scalene Triangle");
            }
        }catch (InputMismatchException e ){
            System.out.println("Type a valid value");
        }finally {
            sc.close();
        }
    }
}
