import java.util.Scanner;

public class CarGame {
    public static void main(String[] args) {
        System.out.println("請輸入第一輛賽車的名稱: ");
        Scanner scanner = new Scanner(System.in);
        String one = scanner.nextLine();
        System.out.println("請輸入第二輛賽車的名稱: ");
        String two = scanner.nextLine();

        Car car1 = new Car(one);
        Car car2 = new Car(two);

//        System.out.println(car1.toString());
//        System.out.println(car2.toString());

        System.out.println("第一輛賽車: " + car1.getName() + "(" + car1.getModel() +")");
        System.out.println("馬力: " + car1.getHorsePower() + ", " + "加速劑數量: " + car1.getBoost());
        System.out.println("第二輛賽車: " + car2.getName() + "(" + car2.getModel() +")");
        System.out.println("馬力: " + car2.getHorsePower() + ", " + "加速劑數量: " + car2.getBoost());

        System.out.println("比賽結束！");
        Track.race(car1, car2);
    }
}
