import java.util.Scanner;
public class ThirteenFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int r1 = sc.nextInt();
        System.out.println("Введите второе число: ");
        int r2 = sc.nextInt();
        //ищем нод
        int r;
        if (r1 < r2) {
            r = r1;
        }
        else {
            r = r2;
        }
        int maxD = 1;
        for (int i = r; i > 0; i--) {
            if (r1 % i == 0 && r2 % i == 0) {
                if (i > maxD) {
                    maxD = i;
                }
            }
        }
        System.out.println("Наибольший общий делитель = " + maxD);

        //находим нок
        int nok = 0;
        for (int i = r; i < 5000; i++) {
            if (i % r1 == 0 && i % r2 == 0) {
                nok = i;
                break;
            }
        }
        System.out.println("Наименьшее общее кратное = " + nok);
    }
}
