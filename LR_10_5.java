import java.util.Scanner;
public class TenFive {
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
        double sr = 0;
        for (int i = 0; i < Nums.length; i++) {
            sr += Nums[i];
        }
        sr /= Nums.length;
        System.out.printf("Среднее арифметическое = %f", sr);
    }
}
