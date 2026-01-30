import java.util.Scanner;
import java.lang.Math;
public class NIneFour {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите x:");
        int x = sc.nextInt();
        System.out.println("Введите n:");
        int n = sc.nextInt();
        System.out.println(Math.pow(x, n));
    }
}
