import java.util.Arrays;
import java.util.Collections;
public class ElevenTwo {
    public static void main(String[] args) {
        String[] cars = {"Hyudai Solaris", "Lada Granta", "BMW M5", "Kia K5", "Lada Priora"};
        System.out.println("Исходный массив: ");
        for (int i = 0; i < cars.length; i++) {
            if (i != cars.length - 1)
                System.out.print(cars[i] + ", ");
            else
                System.out.println(cars[i]);
        }
        System.out.println("Отсортированный по возрастанию: ");
        Arrays.sort(cars);
        for (int i = 0; i < cars.length; i++) {
            if (i != cars.length - 1)
                System.out.print(cars[i] + ", ");
            else
                System.out.println(cars[i]);
        }
        System.out.println("Отсортированный по убыванию: ");
        Arrays.sort(cars, Collections.reverseOrder());
        for (int i = 0; i < cars.length; i++) {
            if (i != cars.length - 1)
                System.out.print(cars[i] + ", ");
            else
                System.out.println(cars[i]);
        }

    }
}
