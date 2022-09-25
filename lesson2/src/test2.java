/**
 * Простая (2 балла)
 * Пользователь задает целое трехзначное число (например, 478).
 * Необходимо вывести число, полученное из заданного перестановкой цифр в обратном порядке (например, 874).
 */
import java.util.Scanner;
public class test2 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое трехзначное число:\n");
        int x = in.nextInt();
        int a = x / 100;
        int ax = x % 100;
        int b = ax / 10;
        int c = ax % 10;
        int y = c * 100 + b * 10 + a;
        System.out.println(y);
                in.close();

    }
}
