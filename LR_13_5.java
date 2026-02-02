import java.util.Scanner;
import java.lang.Math;
public class ThirteenFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите радиус: ");
        int r = sc.nextInt();
        System.out.println("Введите высоту: ");
        int h = sc.nextInt();
        double V = Math.PI * h * r * r * 1/3;
        System.out.println("Объём конуса = " + V);
    }
}
