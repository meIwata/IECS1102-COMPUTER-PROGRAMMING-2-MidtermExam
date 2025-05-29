import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        System.out.print("請使用者輸入姓名: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String result = name.toUpperCase().charAt(0) + name.substring(1, name.length());
        for (int i = 1; i < result.length(); i++) {
            if (result.charAt(i) == 'A' || result.charAt(i) == 'a') {

            }
        }
        System.out.println(result);


    }
}
