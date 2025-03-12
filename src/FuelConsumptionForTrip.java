public class FuelConsumptionForTrip {
    public static void main(String[] args) {
        double kmPerLitre = 12;
        double timeInHour = 2;
        double velocityInKmh = 120;
        double distance = timeInHour * velocityInKmh;

        double litersUsed = distance / kmPerLitre;
        System.out.println("You used: " + litersUsed + "l");
    }
}
