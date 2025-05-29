import java.util.Random;

public class CarUtil {

    public static String getRandomModel() {
        String[] models = {"Sports Car", "Sedan", "SUV"};
        Random rand = new Random();
        int idx = rand.nextInt(models.length);
        return models[idx];
    }

    public static int getRandomHorsePower() {
        Random rand = new Random();
        return 150 + rand.nextInt(51); // 0~50 + 150 = 150~200
    }

    public static int getRandomBoost() {
        Random rand = new Random();
        return rand.nextInt(4); // 0,1,2,3
    }
}