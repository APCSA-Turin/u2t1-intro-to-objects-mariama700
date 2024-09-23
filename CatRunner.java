public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Moonshine", 15, 12.3);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Oreo", 20, 15.6);
        cat2.printCatInfo();
        cat2.introduce();
    }
}
