import java.util.Scanner;
public class EightFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 2 имени:");
        String name1 = sc.nextLine();
        String name2 = sc.nextLine();
        if (name1 == name2)
            System.out.println("Люди являются тезками!");
        else
            System.out.println("Это НЕ тезки");
    }
}
