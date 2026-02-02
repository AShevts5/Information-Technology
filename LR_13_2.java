import java.util.Scanner;
import java.util.Arrays;
public class ThirteenTwo {
    public static void main(String[] args) {
        System.out.println("Введите число элементов массива: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = (int) (Math.random() * n);
        }
        System.out.println("Исходный массив: ");
        for (int i = 0; i < n; i++) {
            if (i == n-1) {
                System.out.println(nums[i]);
            }
            else {
                System.out.print(nums[i] + " ");
            }
        }
        int sum = 0;
        double sr;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }
        sr = sum / nums.length;
        System.out.printf("Среднее арифметическое массива = %f", sr);
    }
}
