import java.util.Random;

public class CarUtil {
    private static final String[] MODELS = {"Sports Car", "Sedan", "SUV"};
    private static final Random RANDOM = new Random();


    public static String getRandomModel() {
        int idx = RANDOM.nextInt(MODELS.length);
        return MODELS[idx];
    }


    public static int getRandomHorsePower() {
        return 150 + RANDOM.nextInt(51); // 0~50 + 150 = 150~200
    }


    public static int getRandomBoost() {
        return RANDOM.nextInt(4); // 0,1,2,3
    }
}