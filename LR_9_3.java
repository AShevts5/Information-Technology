// Решение первого задания через цикл while
/*public class NineThree {
    public static void main(String[] args) {
        int i = 1;
        while (i < 100) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}*/
// Решение 2 задания через цикл while
import java.util.Scanner;
public class NineThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число n:");
        int n = sc.nextInt();
        int f = 1;
        while (n > 0) {
            f *= n;
            n--;
        }
        System.out.println(f);
    }
}
