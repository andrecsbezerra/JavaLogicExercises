import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class YearsMonthsDaysLived {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        sdf.setLenient(false);

        System.out.println("Type your birthday (mm/dd/yyyy): ");
        String birthDateString = sc.nextLine();
        try {
            Date birthDate = sdf.parse(birthDateString);
            String age = ageCalculate(birthDate);
            System.out.println("Your age is: " + age);
        } catch (Exception e) {
            System.out.println("Invalid value (mm/dd/yyyy)");
        } finally {
            sc.close();
        }
    }

    public static String ageCalculate(Date birthDate) {
        Calendar birth = Calendar.getInstance();
        birth.setTime(birthDate);

        Calendar today = Calendar.getInstance();

        int ageYear = today.get(Calendar.YEAR) - birth.get(Calendar.YEAR);
        int ageMonth = today.get(Calendar.MONTH) - birth.get(Calendar.MONTH);
        int ageDay = today.get(Calendar.DAY_OF_MONTH) - birth.get(Calendar.DAY_OF_MONTH);

        if (ageMonth < 0 || (ageMonth == 0 && ageDay < 0)) {
            ageYear--;
            ageMonth += 12;
        }

        if (ageDay < 0) {
            ageMonth--;
            Calendar lastMonth = (Calendar) today.clone();
            lastMonth.add(Calendar.MONTH, -1);
            ageDay += lastMonth.getActualMaximum(Calendar.DAY_OF_MONTH);
        }

        String age = ageYear + " years " + ageMonth + " months " + ageDay + " days";
        return age;
    }
}