
public class Pear extends Fruit {

    public Pear() {
        name = "Hrushka";
        color = "Yellow";
    }

    @Override
    public void ripe() {
        System.out.println(name + " is ripe.");
    }

    @Override
    public void printFruitColor(String color) {
        System.out.println(this.color);
    }
}