public class Exercise23 {
    public static void main(String[] args) {
        double hourlyRate = 40;
        int classesTaughtInTheMonth = 230;
        double inssDiscountPercentage = 0.89;

        double bruteSalary = hourlyRate * classesTaughtInTheMonth;
        double liquidSalary = (hourlyRate * classesTaughtInTheMonth) * inssDiscountPercentage;
        System.out.println("The professor brute salary is: $" + bruteSalary);
        System.out.println("The professor liquid salary is: $" + liquidSalary);
    }
}
