import java.util.Scanner;
public class NineTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите n: ");
        int n = sc.nextInt();
        int f = 1;
        for (int i = n; i > 0; i--) {
            f *= i;
        }
        System.out.println(f);
    }
}
