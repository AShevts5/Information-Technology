//Первый способ - на конкретных числах
/*public class Eight {
    public static void main(String[] args){
        int a = 5, b = 7, c = 100, d = 99;
        int min0 = 1000000000;
        if (a < min0)
            min0 = a;
        if (b < min0)
            min0 = b;
        if (c < min0)
            min0 = c;
        if (c < min0)
            min0 = d;

        System.out.println("Наименьшее число = " + min0);
    }
}*/

//Второй способ - с вводом чисел от пользователя
import java.util.Scanner;
public class Eight {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 4 целых числа:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int min0 = 1000000000;
        if (a < min0)
            min0 = a;
        if (b < min0)
            min0 = b;
        if (c < min0)
            min0 = c;
        if (c < min0)
            min0 = d;

        System.out.println("Наименьшее число = " + min0);

    }
}
