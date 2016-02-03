
public class FruitTest {

    public static void main(String[] args) {

        Apple apple = new Apple();
        Persimmon persimmon = new Persimmon();
        Pear pear = new Pear();

        apple.ripe();
        persimmon.ripe();
        pear.ripe();

        apple.printFruitColor("#FF0000");
        persimmon.printFruitColor("#FFA500");
        pear.printFruitColor("#FFFF00");
    }
}
