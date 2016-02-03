
public abstract class Fruit {

    protected String name;
    protected String color;

    public void ripe() {
        System.out.println("Ripening " + name);
    }
    public void printFruitColor(String fruitColor) {
        color = fruitColor;
        System.out.println(color);
    }

}

