public class Eight {
    public static void main(String[] args){
        int a = 5, b = 7, c = 100, d = 99;

        int n_max = 0, max0 = 0;
        int[] Nums = {5, 7, 100, 99};
        for (int i = 0; i < 4; i++) {
            if (Nums[i] > max0)
                max0 = Nums[i];
        }

        for (int i = 0; i < 4; i++) {
            if (Nums[i] == max0)
                n_max += 1;
        }
        System.out.println("Количество максимальных чисел = " + n_max);
    }
}
