import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        System.out.print("請使用者輸入姓名: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        // 方法一:
//        String input = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();

        // 方法二:
        String upperName = name.toUpperCase();
        String firstChar = upperName.substring(0, 1);                // 取第一個字元(已是大寫)
        String restChars = name.substring(1).toLowerCase();          // 從第二個字元起全部轉小寫
        String input = firstChar + restChars;

        // 預設一個空字串
        String result = "";

        // for 迴圈逐一檢查每一個字元
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            /*如果字元等於題目指定的某個字母，就把對應的數字串接到 result。如果不是，就把原本的字元串接到 result。*/
            if (ch == 'A' || ch == 'a') {
                result += "4";
            } else if (ch == 'E' || ch == 'e') {
                result += "3";
            } else if (ch == 'I' || ch == 'i') {
                result += "1";
            } else if (ch == 'O' || ch == 'o') {
                result += "0";
            } else if (ch == 'S' || ch == 's') {
                result += "5";
            } else if (ch == 'T' || ch == 't') {
                result += "7";
            } else {
                result += ch;
            }
        }

        System.out.println(result);
    }
}