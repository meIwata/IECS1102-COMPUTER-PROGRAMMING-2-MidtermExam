import java.util.Random;

public class Gym {
    private String name;

    public Gym(String name) {
        this.name = name;
    }

    // 返回道館名稱
    public String getName() {
        return name;
    }

    /**
     * 對戰方法，根據等級、屬性、隨機規則決定勝者，並回傳勝者的副本
     */
    public Pokemon fight(Pokemon pokemon1, Pokemon pokemon2) {
        Pokemon winner = null;
        // 等級判斷
        if (pokemon1.getLevel() > pokemon2.getLevel()) {
            System.out.println(pokemon1.getName() + " 勝");
            winner = pokemon1;

        } else if (pokemon1.getLevel() < pokemon2.getLevel()) {
            System.out.println(pokemon2.getName() + " 勝");
            winner = pokemon2;

        } else {
            // 屬性判斷
            String type1 = pokemon1.getType();
            String type2 = pokemon2.getType();
            // Fire 贏 Grass
            if (type1.equals("Fire") && type2.equals("Grass")) {
                System.out.println(pokemon1.getName() + " 勝");
                winner = pokemon1;

            }
            if (type1.equals("Grass") && type2.equals("Fire")) {
                System.out.println(pokemon2.getName() + " 勝");
                winner = pokemon2;
            }
            // Grass 贏 Water
            if (type1.equals("Grass") && type2.equals("Water")) {
                System.out.println(pokemon1.getName() + " 勝");
                winner = pokemon1;
            }
            if (type1.equals("Water") && type2.equals("Grass")) {
                System.out.println(pokemon2.getName() + " 勝");
                winner = pokemon2;
            }
            // Water 贏 Fire
            if (type1.equals("Water") && type2.equals("Fire")) {
                System.out.println(pokemon1.getName() + " 勝");
                winner = pokemon1;
            }
            if (type1.equals("Fire") && type2.equals("Water")) {
                System.out.println(pokemon2.getName() + " 勝");
                winner = pokemon2;
            }
            //隨機選勝者
            String [] players = {pokemon1.getName(), pokemon2.getName()};
            Random random = new Random();
            int index = random.nextInt(players.length);
            System.out.println(players[index] + " 勝");
        }
        return winner;
    }
}