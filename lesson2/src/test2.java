import java.util.Scanner;
public class test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.print("Введите часы:\n");
        int hh = in.nextInt();
        if (hh > 24 | hh < 0) {
            System.out.print("ввод некорректен");

        } else {


            System.out.print("введите минуты\n");
        }
        int mm = in.nextInt();
        if (mm > 60 | mm < 0) {
            System.out.print("ввод некорректен");
        } else {
            System.out.print("Введите секунды\n");

        }
        int ss = in.nextInt();
        if (ss>60|ss<0) {
            System.out.println("ввод некорректен");
        }
        else {
            int x=hh*60*60+mm*60+ss;
            System.out.println ("истекло секунд: " + x);
        }
        in.close ();
    }
}


//  in.close ();