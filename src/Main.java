import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("請輸入寶可夢類別名稱（Psyduck, Charizard, Bulbasaur，或輸入 'exit' 以退出）：");
            String type = scanner.nextLine();
            if (type.equals("exit")) {
                System.out.println("已退出程式。");
                break;
            }
            System.out.print("請輸入寶可夢名稱：");
            String name = scanner.nextLine();

            Pokemon pokemon = null;
            if (type.equals("Psyduck")) {
                pokemon = new Psyduck("Psyduck");
            } else if (type.equals("Charizard")) {
                pokemon = new Charizard("Charizard");
            } else if (type.equals("Bulbasaur")) {
                pokemon = new Bulbasaur("Bulbasaur");
            } else {
                System.out.println("輸入的寶可夢類別無效，請重新輸入。");
                continue;
            }

            pokemon.setName(name);
            pokemon.displayInfo();
        }
        scanner.close();
    }
}