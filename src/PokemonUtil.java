import java.util.Random;

public class PokemonUtil {
    final static int MAX_LEVEL = 20;
    final static int MAX_CANDY = 100;


    public static String generateType() {
        String[] types = {"Fire", "Water", "Grass"};
        Random rand = new Random();
        int idx = rand.nextInt(types.length);
        return types[idx];
    }

    public static int generateLevel() {
        Random rand = new Random();
        return rand.nextInt(MAX_LEVEL) + 1;
    }

    public static int generateCandy() {
        Random rand = new Random();
        return rand.nextInt(MAX_CANDY) + 1;
    }

}
