import java.util.Scanner;

public class TwelveFive {
    public static void main(String[] args) {
        System.out.println("Введите число строк массива: ");
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        System.out.println("Введите число столбцов массива: ");
        int N = sc.nextInt();
        int[][] arr = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = (int) (Math.random() * 300) - 150;
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
        //Сортировка строк по возрастанию:
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N-1; j++) {
                if (arr[i][j] > arr[i][j+1]){
                    int temp = arr[i][j];
                    arr[i][j] = arr[i][j+1];
                    arr[i][j+1] = temp;
                }
            }
        }
        System.out.println("Отсортированный массив: ");
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
    }
}
