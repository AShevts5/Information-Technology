import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;
public class ThirteenOne {
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
        System.out.println("Числа, которые делятся на 3: ");
        for (int i = 0; i < n; i++) {
            if (nums[i] % 3 == 0)
                System.out.println(nums[i]);
        }
        System.out.println("Числа, которые делятся на 6: ");
        for (int i = 0; i < n; i++) {
            if (nums[i] % 6 == 0)
                System.out.println(nums[i]);
        }
        System.out.println("Числа, которые делятся и на 3, и на 6: ");
        for (int i = 0; i < n; i++) {
            if (nums[i] % 3 == 0 && nums[i] % 6 == 0)
                System.out.println(nums[i]);
        }
    }
}
