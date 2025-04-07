
import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random r = new Random();
        
        int number = r.nextInt(100) + 1; // Generates a number from 1 to 8
        
        System.out.println(number);
    }
}
