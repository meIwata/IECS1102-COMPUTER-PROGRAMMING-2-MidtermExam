public class Pokemon {
    private static int pokemonCount = 0;

    private String name;
    private String type;
    private int level;
    private int candy;

    public Pokemon(String name) {
        this.name = name;
        this.type = PokemonUtil.generateType();
        this.level = PokemonUtil.generateLevel();
        this.candy = PokemonUtil.generateCandy();
        pokemonCount++;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    public int getCandy() {
        return candy;
    }

    public int getPokemonCount() {
        return pokemonCount;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public void setType(String type) {
        this.type = type;
    }

//    public void setLevel(int level) {
//        this.level = level;
//    }
//
//    public void setCandy(int candy) {
//        this.candy = candy;
//    }

    public void evolve() {
        if (getCandy() >= 10) {
            candy -= 10;
            level++;
        } else {
            System.out.println("目前糖果數量: " + getCandy() + "  糖果數量不足10");
        }
    }

    public void displayInfo() {
        System.out.println("Pokemon{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", level=" + level +
                ", candy=" + candy +
                '}');
    }
}
