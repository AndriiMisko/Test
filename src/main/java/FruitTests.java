import example.Fruit;
import example.Apple;
import example.Pear;
import example.Persimmon;

public class FruitTests {
    public static void main(String[] args) {
        // TODO
        // create objects of your classes here
        Fruit fruitObject = new Fruit();
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
 public static void printFruitColor(Fruit fruitObject){
        System.out.println(fruitObject.getName()+ " is " + fruitObject.getColor());
    }

}
