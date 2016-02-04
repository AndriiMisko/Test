package osvyd;

public class FruitTest {

        public static void main(String[] args) {

        Apple apple = new Apple("apple", "green", "ripe");
        Pear pear = new Pear("pear", "green",  "ripe");
        Persimmon persimmon = new Persimmon( "persimmon",  "green", "ripe");


            apple.ripe();
            pear.ripe();
            persimmon.ripe();

            printFruitColor(apple);
            printFruitColor(pear);
            printFruitColor(persimmon);
    }

    public static void printFruitColor (FruitAbstract fruit) {
        System.out.println(fruit.name + " is " + fruit.color);
    }

    public static void ripe(FruitAbstract r){
        System.out.println(r.name + " is " + r.action);
    }

}