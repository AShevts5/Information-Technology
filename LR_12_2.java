import java.util.Arrays;
public class TwelveTwo {
    public static void main(String[] args) {
        int[][] C = new int[3][3];
        int[][] D = new int[3][3];
        System.out.println("Исходная матрица C: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                C[i][j] = (int) (Math.random() * 100);
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 2) {
                    System.out.println(C[i][j]);
                }
                else {
                    System.out.print(C[i][j] + " ");
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                D[i][j] = (int) (Math.random() * 100);
            }
        }
        System.out.println("Исходная матрица D: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 2) {
                    System.out.println(D[i][j]);
                }
                else {
                    System.out.print(D[i][j] + " ");
                }
            }
        }

        //Сложение матриц
        int[][] N = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                N[i][j] = C[i][j] + D[i][j];
            }
        }
        System.out.println("Результат сложения матриц: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 2) {
                    System.out.println(N[i][j]);
                }
                else {
                    System.out.print(N[i][j] + " ");
                }
            }
        }
        System.out.println("Результат умножения матриц: ");
        int[][] U = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int sum = 0;
                for (int k = 0; k < 3; k++) {
                    sum += C[i][k] * D[k][j];
                }
                U[i][j] = sum;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 2) {
                    System.out.println(U[i][j]);
                }
                else {
                    System.out.print(U[i][j] + " ");
                }
            }
        }

    }
}
