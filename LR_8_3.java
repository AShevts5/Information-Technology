import java.util.Scanner;
public class EightThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] Nums = new int[5];
        System.out.println("Введите 5 целых чисел:");
        for (int i = 0; i < 5; i++) {
            Nums[i] = sc.nextInt();
        }
        int maxV = -1000000000, minV = 1000000000;
        for (int i = 0; i < 5; i++){
            if (Nums[i] > maxV) {
                maxV = Nums[i];
            }
        }
        for (int i = 0; i < 5; i++){
            if (Nums[i] < minV) {
                minV = Nums[i];
            }
        }
        System.out.println("Наибольшее число = " + maxV);
        System.out.println("Наименьшее число = " + minV);
    }
}
