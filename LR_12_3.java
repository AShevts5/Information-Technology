import java.util.Scanner;
import java.util.Arrays;
public class TwelveThree {
    public static void main(String[] args) {
        System.out.println("Введите число строк в массиве: ");
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        System.out.println("Введите число столбцов в массиве: ");
        int N = sc.nextInt();
        int[][] arr = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
        System.out.println("Исходный массив: ");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (j == N-1) {
                    System.out.println(arr[i][j]);
                }
                else {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                sum += arr[i][j];
            }
        }
        System.out.printf("Сумма всех элементов массива = %d", sum);
    }
}
