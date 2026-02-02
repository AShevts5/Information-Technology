public class ElevenOne {
    public static void main(String[] args) {
        int[] Nums = new int[20];
        System.out.print("Исходный массив: ");
        for (int i = 0; i < Nums.length; i++) {
            Nums[i] = (int) (Math.random() * 1001);
            if (i != Nums.length - 1)
                System.out.print(Nums[i] + ", ");
            else
                System.out.println(Nums[i]);

        }
    bubbleSort(Nums);
    }
    public static void bubbleSort(int[] Nums) {
        for (int i = 0; i < Nums.length - 1; i++) {
            for (int j = 0; j < Nums.length - 1 - i; j++) {
                if (Nums[j] > Nums[j+1]) {
                    int n = Nums[j];
                    Nums[j] = Nums[j+1];
                    Nums[j+1] = n;
                }
            }
        }
        System.out.print("Отсортированный массив: ");
        for (int i = 0; i < Nums.length; i++) {
            if (i != Nums.length - 1)
                System.out.print(Nums[i] + ", ");
            else
                System.out.println(Nums[i]);
        }
    }

}
