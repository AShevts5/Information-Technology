import java.util.Scanner;
import java.lang.Math;
public class ThirteenThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первый катет: ");
        int k1 = sc.nextInt();
        System.out.println("Введите второй катет: ");
        int k2 = sc.nextInt();
        System.out.println("Первый катет = " + k1);
        System.out.println("Второй катет = " + k2);
        double s = (k1 * k2)/2;
        System.out.println("Площадь = " + s);
        double g = Math.sqrt(Math.pow(k1, 2) + Math.pow(k2, 2));
        double p = g + k1 + k2;
        System.out.println("Периметр = " + p);
    }
}
