import java.util.Scanner;
public class TenTwo {
    public static void main (String[] args) {
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
        System.out.println("Минимальные элементы: ");
        int minV = Nums[0];
        for (int i = 0; i < Nums.length; i++) {
            if (Nums[i] <= minV) {
                minV = Nums[i];
                System.out.println(minV);
            }
        }
    }
}
