public class TenOne {
    public static void main(String[] args) {
        int[] Odd = new int[10];
        int k = 0;
        for (int i = 0; i < 20; i++) {
            if (i % 2 != 0) {
                Odd[k] = i;
                k++;
            }
            if (k > 10)
                break;
        }
        for (int j = 0; j < Odd.length; j++) {
            System.out.print(Odd[j]);
            if (j < Odd.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
