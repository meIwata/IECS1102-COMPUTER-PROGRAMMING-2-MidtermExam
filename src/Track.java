import java.util.Random;

public class Track {
    public static void race(Car car1, Car car2) {
        if (car1.getFinalHorsePower() > car2.getFinalHorsePower()) {
            System.out.println("獲勝者是: " + car1.getName() +"(" +car1.getModel() +  ")" + "，馬力: " + car1.getHorsePower());
//            System.out.println(car1.getName() + "勝");
        } else if (car1.getFinalHorsePower() < car2.getFinalHorsePower()) {
            System.out.println("獲勝者是: " + car2.getName() +"(" +car2.getModel() +  ")" + "，馬力: " + car2.getHorsePower());
//            System.out.println(car2.getName() + "勝");
        } else {

            if (car1.getModel().equals("Sports Car") && !car2.getModel().equals("Sports Car")) {
                System.out.println("獲勝者是: " + car1.getName() +"(" +car1.getModel() +  ")" + "，馬力: " + car1.getHorsePower());
//                System.out.println(car1.getName() + "勝");
            } else if (car2.getModel().equals("Sports Car") && !car1.getModel().equals("Sports Car")) {
                System.out.println("獲勝者是: " + car2.getName() +"(" +car2.getModel() +  ")" + "，馬力: " + car2.getHorsePower());
//                System.out.println(car2.getName() + "勝");
            } else if (car1.getModel().equals("Sedan") && !car2.getModel().equals("Sedan")) {
                System.out.println("獲勝者是: " + car1.getName() +"(" +car1.getModel() +  ")" + "，馬力: " + car1.getHorsePower());
//                System.out.println(car1.getName() + "勝");
            } else if (car2.getModel().equals("Sedan") && !car1.getModel().equals("Sedan")) {
                System.out.println("獲勝者是: " + car2.getName() +"(" +car2.getModel() +  ")" + "，馬力: " + car2.getHorsePower());
//                System.out.println(car2.getName() + "勝");
            } else {

                String[] chosenArray = {car1.getName(), car2.getName()};
                Random random = new Random();
                int index = random.nextInt(chosenArray.length);
                System.out.println(chosenArray[index] + "勝");
            }
        }
    }
}