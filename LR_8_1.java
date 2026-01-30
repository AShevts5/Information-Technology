public class Eight {
    public static void main(String[] args){
        int a = 5, b = 7, c = 100, d = 99;
        int min0 = 1000000000;
        if (a < min0)
            min0 = a;
        if (b < min0)
            min0 = b;
        if (c < min0)
            min0 = c;
        if (c < min0)
            min0 = d;

        System.out.println("Наименьшее число = " + min0);
    }
}
