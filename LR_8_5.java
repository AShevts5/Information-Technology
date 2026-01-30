import java.util.Scanner;
public class EightFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер месяца: ");
        int num = sc.nextInt();
        String Season;
        int[] Winter = {12, 1, 2};
        int[] Spring = {3, 4, 5};
        int[] Summer = {6, 7, 8};
        int[] Autumn = {9, 10, 11};
        
        for (int i : Winter) {
            if (i == num)
                System.out.println("Зима!");
        }
        for (int i : Spring) {
            if (i == num)
                System.out.println("Весна!");
        }
        for (int i : Summer) {
            if (i == num)
                System.out.println("Лето!");
        }
        for (int i : Autumn) {
            if (i == num)
                System.out.println("Осень!");
        }
    }
}
