public class Dog {
    private int weight; // вес собаки
    private String name; // имя собаки
    private String breed; // порода собаки
    public void eat() {
        System.out.println("Eating...");
    }
    public void sleep() {
        System.out.println("Sleeping...");
    }
    public String speak(String words) {
        String phrase = words + "...gaff...\n";
        return phrase;
    }
    public void play() {
        System.out.println("Playing with the owner...");
    }
}
