package igoshta;

public class FruitTests {
    public static void main(String[] args) {
        // TODO
        // create objects of your classes here
        Apple apple = new Apple();
        Pear pear = new Pear();
        Persimmon persimmon = new Persimmon();

        // call ripe() methods for each of the objects
        apple.ripe();
        pear.ripe();
        persimmon.ripe();

        printFruitColor(apple);
        printFruitColor(pear);
        printFruitColor(persimmon);
    }

    // TODO
    // fill out the printFruitColor method
    public static void printFruitColor(AbstractFruit someFruit){
        System.out.println("Color of "+someFruit.name+" is "+someFruit.color);
    }
}
