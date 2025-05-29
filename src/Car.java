public class Car {
    private String name;
    private String model;
    private int horsePower;
    private int boost;

    public Car(String name) {
        this.name = name;
        this.model = CarUtil.getRandomModel();
        this.horsePower = CarUtil.getRandomHorsePower();
        this.boost = CarUtil.getRandomBoost();
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public int getBoost() {
        return boost;
    }

    public int getFinalHorsePower() {
        return horsePower + (boost * 5);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", horsePower=" + horsePower +
                ", boost=" + boost +
                ", FinalHorsePower=" + getFinalHorsePower() +
                '}';
    }
}
