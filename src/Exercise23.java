public class Exercise23 {
    public static void main(String[] args) {
        double hourlyRate = 40;
        int classesTaughtInTheMonth = 230;
        double inssDiscountPercentage = 0.11;

        double salary = (hourlyRate * classesTaughtInTheMonth) - inssDiscountPercentage;
        System.out.println("The professor liquid salary is: $" + salary);
    }
}
