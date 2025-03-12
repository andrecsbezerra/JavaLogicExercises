import java.util.Random;

public class RandomValue {
    public static void main(String[] args) {
        Random rd = new Random();
        System.out.println(rd.nextInt(101));
    }
}
