import java.util.Arrays;
public class TwelveOne {
    public static void main(String[] args) {
        int[][] arr = new int[5][6];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == 2 && j != 5)
                    System.out.print(arr[i][j] + ", ");
                else if (i == 2 && j == 5)
                    System.out.println(arr[i][j]);
            }
        }

    }
}
