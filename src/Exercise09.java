import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Type your weight (kg): ");
            double weight = sc.nextDouble();
            System.out.println("Type your height (cm): ");
            double height = sc.nextDouble();
            height /= 100;
            double imc = weight / (Math.pow(height,2));

            if (imc < 18.5){
                System.out.printf("IMC: %.2f\n", imc);
                System.out.println("Underweight");
            }else if (imc >= 18.5 && imc <= 24.9){
                System.out.printf("IMC: %.2f\n", imc);
                System.out.println("Ideal weight (congratulations)");
            }else if (imc >= 25.0 && imc <= 29.9){
                System.out.printf("IMC: %.2f\n", imc);
                System.out.println("Overweight");
            }else if (imc >= 30.0 && imc <= 34.9){
                System.out.printf("IMC: %.2f\n", imc);
                System.out.println("Obesity grade I");
            }else if (imc >= 35.0 && imc <= 39.9){
                System.out.printf("IMC: %.2f\n", imc);
                System.out.println(" Obesity grade II (severe)");
            }else if (imc >= 40){
                System.out.printf("IMC: %.2f\n", imc);
                System.out.println("Obesity grade III (morbid)");
            }
        }catch (InputMismatchException e ){
            System.out.println("Type a valid value");
        }
        sc.close();
    }
}
