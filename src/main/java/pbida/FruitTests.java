package pbida;

public class FruitTests {

    public static void main(String[] args) {
        // TODO
        // create objects of your classes here

        Apple apple = new Apple();
        Pear pear = new Pear();
        Persimon persimon = new Persimon();

        // call ripe() methods for each of the objects

        apple.ripe(apple.name);
        printFruitColor(apple.color);

        pear.ripe(pear.name);
        printFruitColor(pear.color);

        persimon.ripe(persimon.name);
        printFruitColor(persimon.color);
    }

    // TODO
    // fill out the printFruitColor method
    public static void printFruitColor(String color){
        System.out.println("It is " + color);
    }
}
