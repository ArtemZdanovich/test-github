/**
 * Простая (2 балла)
 *
 * Определить, четное ли данное число
 *
 */
import java.util.Scanner;
public class test2 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int num = in.nextInt();
        if ( num%2!=0 ) {
            System.out.printf ("Вы ввели нечетное число %d.", num);
        }
        else {
            System.out.printf ("Вы ввели четное число %d.", num);
        }

        in.close();

    }
}


//  in.close ();