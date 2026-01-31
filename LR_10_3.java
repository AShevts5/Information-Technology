import java.util.Scanner;
public class TenThree {
    public static void main(String [] args) {
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
        int maxV = Nums[0];
        for (int i = 0; i < Nums.length; i++) {
            if (Nums[i] > maxV) {
                maxV = Nums[i];
            }
        }
        System.out.printf("Наибольший элемент массива = %d", maxV);
    }
}

