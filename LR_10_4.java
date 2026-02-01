import java.util.Scanner;
public class TenFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размерность массива (N) :");
        int N = sc.nextInt();
        int[] Nums = new int[N];
        System.out.println("Введите элементы массива: ");
        int k = 0;
        while (k < Nums.length) {
            int num = sc.nextInt();
            Nums[k] = num;
            k++;
        }
        System.out.println("Изначальный массив: ");
        for (int j = 0; j < Nums.length; j++) {
            System.out.print(Nums[j]);
            if (j < Nums.length - 1) {
                System.out.print(", ");
            }
            if (j == Nums.length - 1) {
                System.out.println("\n");
            }
        }
        int maxV = Nums[0], maxInd = 0;
        for (int i = 0; i < Nums.length; i++) {
            if (Nums[i] > maxV) {
                maxV = Nums[i];
                maxInd = i;
            }
        }
        int minV = Nums[0], minInd = 0;
        for (int i = 0; i < Nums.length; i++) {
            if (Nums[i] < minV) {
                minV = Nums[i];
                minInd = i;
            }
        }
        for (int i = 0; i < Nums.length; i++) {
            if (i == minInd) {
                Nums[i] = maxV;
            }
            if (i == maxInd) {
                Nums[i] = minV;
            }
        }
        System.out.println("Изменённый массив: ");
        for (int j = 0; j < Nums.length; j++) {
            System.out.print(Nums[j]);
            if (j < Nums.length - 1) {
                System.out.print(", ");
            }
        }

    }
}
